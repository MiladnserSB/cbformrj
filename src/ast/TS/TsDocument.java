package ast.TS;

import ast.ASTNode;
import java.util.List;

public class TsDocument implements ASTNode {
    private List<TsDocumentStatement> statements;

    public TsDocument(List<TsDocumentStatement> statements) {
        this.statements = statements;
    }

    public List<TsDocumentStatement> getStatements() {
        return statements;
    }

    public void setStatements(List<TsDocumentStatement> statements) {
        this.statements = statements;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "TS Document:");
        for (TsDocumentStatement statement : statements) {
            statement.prettyPrint(indent + "  ");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (TsDocumentStatement s : statements) {
            sb.append(s.toString()).append("\n");
        }
        return sb.toString().trim();
    }
}
