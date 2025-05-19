package SymanticCheck;

import ast.SymbolTable.SymbolTable;
import ast.SymbolTable.Row;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class AlreadyDefinedVariableError extends RuntimeException {
    private static final String ERROR_LOG_FILE = "errors.txt";
    public SymbolTable alreadyDefinedVariableErrorsymbolTable;
    private String variableName;
    private int lineNumber;

    public AlreadyDefinedVariableError(String variableName, SymbolTable symbolTable, int lineNumber) {
        super("Already defined variable: " + variableName);
        this.variableName = variableName;
        this.alreadyDefinedVariableErrorsymbolTable = symbolTable;
        this.lineNumber = lineNumber;

    }

    public boolean check() {
        return alreadyDefinedVariableErrorsymbolTable.getRow(variableName) != null;
    }

    public void throwIfUndefined() throws AlreadyDefinedVariableError {
        this.alreadyDefinedVariableErrorsymbolTable.print();
            logError();
            throw this;

    }

    private void logError() {
        try (FileWriter writer = new FileWriter(ERROR_LOG_FILE, true)) {
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

            writer.write("=== COMPILATION ERROR ===\n");
            writer.write("Timestamp: " + timestamp + "\n");
            writer.write("Line: " + lineNumber + "\n");
            writer.write("Error: " + getMessage() + "\n");
            writer.write("\nCurrent Symbol Table:\n");
            writer.write(getSymbolTableAsString());
            writer.write("\n\n"); // Separate errors with blank lines
        } catch (IOException e) {
            System.err.println("Failed to write to error log: " + e.getMessage());
        }
    }

    private String getSymbolTableAsString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Current Scope: ").append(alreadyDefinedVariableErrorsymbolTable.getCurrentScope()).append("\n");
        sb.append("Defined Variables:\n");

        // This assumes your SymbolTable has a method to get all rows
        // You'll need to implement this in your SymbolTable class
        for (Map.Entry<String, Row> entry : alreadyDefinedVariableErrorsymbolTable.getAllRows().entrySet()) {
            Row row = entry.getValue();
            sb.append("- ")
                    .append(row.getName())
                    .append(" : ")
                    .append(row.getType())
                    .append(" = ")
                    .append(row.getValue())
                    .append("\n");
        }

        return sb.toString();
    }

    // Call this at the start of compilation to clear previous errors
    public static void clearErrorLog() {
        try (FileWriter writer = new FileWriter(ERROR_LOG_FILE, false)) {
            writer.write(""); // Clear the file
        } catch (IOException e) {
            System.err.println("Failed to clear error log: " + e.getMessage());
        }
    }
}