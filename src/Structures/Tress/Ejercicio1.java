package Structures.Tress;

import Structures.Node.Node;

public class Ejercicio1 {

    public void insert(int[] numeros) {

        // Crear el arbol de enteros
        // Insertar cada numero
        // Imprimir el arbol
        BinaryTree<Integer> arbolInt = new BinaryTree<>();

        for (int numero : numeros) {
            arbolInt.add(numero);
        }

        printTree(arbolInt.getRoot());

    }

    public void printTree(Node<Integer> root) {

        System.out.println("Imprimiendo el arbol");
        printTreeRecursivo(root, 0);

    }

    private void printTreeRecursivo(Node<Integer> actual, int nivel) {

        if(actual==null)
            return;

        printTreeRecursivo(actual.getRight(),nivel + 1);

        for (int i = 0; i < nivel; i++) {
            System.out.print("    ");
        }
        System.out.println(actual.getValue());
        printTreeRecursivo(actual.getLeft(), nivel + 1);

    }

}
