package ast.TS;

import ast.ASTNode;

import java.util.List;

public class TsDocument implements ASTNode {
    private List<ASTNode> statements;

    public TsDocument(List<ASTNode> statements) {
        this.statements = statements;
    }

    public List<ASTNode> getStatements() {
        return statements;
    }

    public void setStatements(List<ASTNode> statements) {
        this.statements = statements;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "TS Document:");
        for (ASTNode statement : statements) {
            if (statement != null) {
                statement.prettyPrint(indent + "  ");
            } else {
                System.out.println(indent + "  [Null Statement]");
            }
        }
    }
}