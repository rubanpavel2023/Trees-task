package Trees.TreeAlgorithms;

import Trees.Nodes.Node;

public class TraversalTree {

    public void printInorder(Node node) {
        if (node == null)
            return;

        printInorder(node.getLeft());

        System.out.print(node.getValue() + " ");

        printInorder(node.getRight());
    }

    public void printPreorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.getValue() + " ");

        printPreorder(node.getLeft());

        printPreorder(node.getRight());
    }

    public void printPostorder(Node node) {
        if (node == null)
            return;

        printPostorder(node.getLeft());

        printPostorder(node.getRight());

        System.out.print(node.getValue() + " ");
    }

}

