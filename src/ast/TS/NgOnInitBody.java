package ast.TS;

import ast.ASTNode;

public class NgOnInitBody implements ASTNode {
    private boolean leftThis;
    private String leftIdentifier;
    private boolean rightThis;
    private String rightIdentifier; // could be null if RHS is missing
    private MethodCall methodCall;  // optional

    public NgOnInitBody(boolean leftThis, String leftIdentifier, boolean rightThis,
                        String rightIdentifier, MethodCall methodCall) {
        this.leftThis = leftThis;
        this.leftIdentifier = leftIdentifier;
        this.rightThis = rightThis;
        this.rightIdentifier = rightIdentifier;
        this.methodCall = methodCall;
    }

    public boolean isLeftThis() {
        return leftThis;
    }

    public String getLeftIdentifier() {
        return leftIdentifier;
    }

    public boolean isRightThis() {
        return rightThis;
    }

    public String getRightIdentifier() {
        return rightIdentifier;
    }

    public MethodCall getMethodCall() {
        return methodCall;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ngOnInit Body Assignment:");
        System.out.println(indent + "  Left: " + (leftThis ? "this." : "") + leftIdentifier);
        if (rightIdentifier != null) {
            System.out.print(indent + "  Right: " + (rightThis ? "this." : "") + rightIdentifier);
            if (methodCall != null) {
                System.out.print("." + methodCall.getMethodName() + "()");
            }
            System.out.println();
        } else {
            System.out.println(indent + "  Right: null");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(leftThis ? "this." : "").append(leftIdentifier).append(" = ");
        if (rightIdentifier != null) {
            sb.append(rightThis ? "this." : "").append(rightIdentifier);
            if (methodCall != null) {
                sb.append(".").append(methodCall.getMethodName()).append("()");
            }
        } else {
            sb.append("null");
        }
        return sb.toString();
    }
}
