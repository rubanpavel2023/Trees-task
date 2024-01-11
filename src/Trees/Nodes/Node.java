package Trees.Nodes;


public class Node {
    private int value;
    private Node left, right;

    public Node(int item) {
        value = item;
        left = null;
        right = null;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}

