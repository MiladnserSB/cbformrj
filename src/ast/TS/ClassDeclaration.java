package ast.TS;

import ast.ASTNode;

import java.util.List;

public class ClassDeclaration implements ASTNode {
    private String className;
    private String implementsClause;
    private List<ASTNode> classBody;

    public ClassDeclaration(String className, String implementsClause, List<ASTNode> classBody) {
        this.className = className;
        this.implementsClause = implementsClause;
        this.classBody = classBody;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getImplementsClause() {
        return implementsClause;
    }

    public void setImplementsClause(String implementsClause) {
        this.implementsClause = implementsClause;
    }

    public List<ASTNode> getClassBody() {
        return classBody;
    }

    public void setClassBody(List<ASTNode> classBody) {
        this.classBody = classBody;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Class Declaration:");
        System.out.println(indent + "  Class Name: " + className);
        if (implementsClause != null && !implementsClause.isEmpty()) {
            System.out.println(indent + "  Implements: " + implementsClause);
        }
        System.out.println(indent + "  Class Body:");
        for (ASTNode node : classBody) {
            if (node != null) {
                node.prettyPrint(indent + "    ");
            } else {
                System.out.println(indent + "    [Null Statement]");
            }
        }
    }
}