package Trees;

import Trees.TreeAlgorithms.TraversalTree;

public class Main {
    public static void main(String[] args) {
        CreatTree tree = new CreatTree();
        tree.initializeTree();

        TraversalTree traversal = new TraversalTree();

        System.out.println("Inorder traversal:");
        traversal.printInorder(tree.getRootNode());

        System.out.println("\nPreorder traversal:");
        traversal.printPreorder(tree.getRootNode());

        System.out.println("\nPostorder traversal:");
        traversal.printPostorder(tree.getRootNode());
    }

}
