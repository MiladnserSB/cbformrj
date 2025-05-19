package ast;

public class TextContent implements ASTNode {
    private final String text;

    public TextContent(String text) {
        this.text = text;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Text: " + text);
    }
}