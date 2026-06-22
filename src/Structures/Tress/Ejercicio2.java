package Structures.Tress;

import Structures.Node.Node;

public class Ejercicio2 {

    public void invertTree(Node<Integer> root) {

        System.out.println("Arbol Original:");
        printTree(root);

        printInvertidoRecursivo(root);

        System.out.println("Arbol Invertido:");
        printTree(root);

    }

    public void printTree(Node<Integer> root) {

        System.out.println("Imprimiendo el arbol");
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

    private void printInvertidoRecursivo(Node<Integer> actual) {

        if (actual == null)
            return;

        Node<Integer> aux = actual.getLeft();
        actual.setLeft(actual.getRight());
        actual.setRight(aux);

        printInvertidoRecursivo(actual.getLeft());
        printInvertidoRecursivo(actual.getRight());

    }

}
