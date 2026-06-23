package Structures.Tress;

import Structures.Node.Node;

public class Ejercicio4 {

    public int maxDepth(Node<Integer> root) {

        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.getLeft());
        int rightDepth = maxDepth(root.getRight());

        return Math.max(leftDepth, rightDepth) + 1;

    }

    public void printTree(Node<Integer> root) {

        printTreeRecursivo(root, 0);

    }

    private void printTreeRecursivo(Node<Integer> actual, int nivel) {

        if (actual == null)
            return;

        printTreeRecursivo(actual.getRight(), nivel + 1);

        for (int i = 0; i < nivel; i++) {
            System.out.print("    ");
        }
        System.out.println(actual.getValue());
        printTreeRecursivo(actual.getLeft(), nivel + 1);

    }

}
