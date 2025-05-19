package ast.TS;

import ast.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class ImplementsClause implements ASTNode {
    private List<String> interfaces;

    public ImplementsClause() {
        this.interfaces = new ArrayList<>();
    }

    public void addInterface(String name) {
        interfaces.add(name);
    }

    public List<String> getInterfaces() {
        return interfaces;
    }

    @Override
    public void prettyPrint(String indent) {
        if (!interfaces.isEmpty()) {
            System.out.println(indent + "Implements Clause:");
            for (String iface : interfaces) {
                System.out.println(indent + "  - " + iface);
            }
        }
    }

    @Override
    public String toString() {
        if (interfaces.isEmpty()) {
            return "";
        }
        return "implements " + String.join(", ", interfaces);
    }
}
