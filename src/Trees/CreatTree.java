package Trees;

import Trees.Nodes.Node;

public class CreatTree {
    private Node rootNode;

    public Node getRootNode() {
        return rootNode;
    }

    public void initializeTree() {
        rootNode = new Node(6);
        rootNode.setLeft(new Node(2));
        rootNode.setRight(new Node(7));
        rootNode.getLeft().setLeft(new Node(22));
        rootNode.getLeft().setRight(new Node(5));
        rootNode.getRight().setLeft(new Node(1));
        rootNode.getRight().setRight(new Node(7));
        rootNode.getLeft().getLeft().setLeft(new Node(86));
        rootNode.getLeft().getLeft().setRight(new Node(23));
        rootNode.getRight().getLeft().setLeft(new Node(55));
        rootNode.getRight().getLeft().setRight(new Node(72));
        rootNode.getRight().getRight().setRight(new Node(4));
    }
}


