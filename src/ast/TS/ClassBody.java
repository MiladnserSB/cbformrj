package ast.TS;

import ast.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class ClassBody implements ASTNode {
    private List<ASTNode> members;

    public ClassBody() {
        this.members = new ArrayList<>();
    }

    public void addMember(ASTNode node) {
        this.members.add(node);
    }

    public List<ASTNode> getMembers() {
        return members;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Class Body:");
        for (ASTNode member : members) {
            member.prettyPrint(indent + "  ");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (ASTNode member : members) {
            sb.append(member.toString()).append("\n");
        }
        return sb.toString().trim();
    }
}
