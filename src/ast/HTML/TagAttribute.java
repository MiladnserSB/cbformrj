package ast.HTML;

import ast.ASTNode;

public class TagAttribute implements ASTNode {
    private final String value;
    private final boolean isMethodCall;

    public TagAttribute(String value, boolean isMethodCall) {
        this.value = value;
        this.isMethodCall = isMethodCall;
    }

    public String getValue() {
        return value;
    }

    public boolean isMethodCall() {
        return isMethodCall;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Tag Attribute:");
        System.out.println(indent + "  Value: " + value);
        System.out.println(indent + "  Is Method Call: " + isMethodCall);
    }
}