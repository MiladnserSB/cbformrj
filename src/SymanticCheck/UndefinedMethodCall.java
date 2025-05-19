package SymanticCheck;

import ast.SymbolTable.Row;
import ast.SymbolTable.SymbolTable;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class UndefinedMethodCall extends RuntimeException{
    private static final String ERROR_LOG_FILE = "errors.txt";
    public SymbolTable UndefinedMethodCallSymboltable = new SymbolTable();
    public String methodName;
    public int lineNumber;


    public UndefinedMethodCall(  String methodName, int lineNumber) {
        super("Undefined method: " + methodName);
        this.methodName = methodName;
        this.lineNumber = lineNumber;
    }
    public boolean check() {
        return UndefinedMethodCallSymboltable.getRow(methodName) != null;
    }

    public void throwIfUndefined() throws AlreadyDefinedVariableError {
        this.UndefinedMethodCallSymboltable.print();
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
        sb.append("Current Scope: ").append(UndefinedMethodCallSymboltable.getCurrentScope()).append("\n");

        // This assumes your SymbolTable has a method to get all rows
        // You'll need to implement this in your SymbolTable class
        for (Map.Entry<String, Row> entry : UndefinedMethodCallSymboltable.getAllRows().entrySet()) {
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
