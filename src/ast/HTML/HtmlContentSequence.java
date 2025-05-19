package ast.HTML;

import ast.ASTNode;
import java.util.List;

public class HtmlContentSequence implements ASTNode {
    private List<ASTNode> contentElements;
    private String rawContent;

    public HtmlContentSequence(List<ASTNode> contentElements, String rawContent) {
        this.contentElements = contentElements;
        this.rawContent = rawContent;
    }

    // Add these getter methods
    public List<ASTNode> getContentElements() {
        return contentElements;
    }

    public String getRawContent() {
        return rawContent;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "HTML Content:");
        if (contentElements != null && !contentElements.isEmpty()) {
            for (ASTNode element : contentElements) {
                if (element != null) {
                    element.prettyPrint(indent + "  ");
                } else {
                    System.out.println(indent + "  [Null Content]");
                }
            }
        }
        if (rawContent != null && !rawContent.isEmpty()) {
            System.out.println(indent + "  Raw Content: \"" + rawContent + "\"");
        }
    }
}