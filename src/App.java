import java.util.ArrayList;
import java.util.List;

import Models.Persona;
import Structures.Node.Node;
import Structures.Tress.BinaryTree;
import Structures.Tress.Ejercicio1;
import Structures.Tress.Ejercicio2;
import Structures.Tress.Ejercicio3;
import Structures.Tress.Ejercicio4;
import Structures.Tress.IntTree;

public class App {
    public static void main(String[] args) throws Exception {

        // runIntTree();

        // runBinaryTree();

        runEjercicios();

    }

    private static void runEjercicios() {

        System.out.println("Ejercicio 1");

        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] numeros = new int[] { 5, 3, 7, 2, 4, 6, 8 };
        ejercicio1.insert(numeros);

        // -------------------------------------------------//

        System.out.println();
        System.out.println("Ejercicio 2");

        Ejercicio2 ejercicio2 = new Ejercicio2();
        int[] numeros2 = new int[] { 5, 3, 7, 2, 4, 6, 8, 9, 1 };

        BinaryTree<Integer> tree = new BinaryTree<>();
        for (int i : numeros2) {
            tree.add(i);
        }

        Node<Integer> root = tree.getRoot();
        ejercicio2.invertBinaryTree(root);

        // -------------------------------------------------//

        System.out.println();
        System.out.println("Ejercicio 3");

        Ejercicio3 ejercicio3 = new Ejercicio3();

        int[] numeros3 = new int[] { 4, 2, 7, 1, 3, 6, 9 };

        BinaryTree<Integer> tree3 = new BinaryTree<>();
        for (int i : numeros3) {
            tree3.add(i);
        }

        ejercicio3.printTree(tree3.getRoot());
        ejercicio3.printLevels(tree3.getRoot());

        // -------------------------------------------------//

        System.out.println();
        System.out.println("Ejercicio 4");

        Ejercicio4 ejercicio4 = new Ejercicio4();

        int[] numeros4 = new int[] { 4, 2, 7, 1, 3, 8 };

        BinaryTree<Integer> tree4 = new BinaryTree<>();
        for (int i : numeros4) {
            tree4.add(i);
        }

        System.out.println("Arbol :");
        ejercicio4.printTree(tree4.getRoot());
        
        System.out.println();
        System.out.println("Profunidad :");
        System.out.println(ejercicio4.maxDepth(tree4.getRoot()));

    }

    private static void runBinaryTree() {

        BinaryTree<String> arbolStrings = new BinaryTree<>();
        BinaryTree<Persona> arbolPersonas = new BinaryTree<>();

        arbolPersonas.add(new Persona("Pablo", 30));
        arbolPersonas.add(new Persona("Ana", 25));
        arbolPersonas.add(new Persona("Luis", 35));
        arbolPersonas.add(new Persona("Maria", 28));

    }

    private static void runIntTree() {

        IntTree arbolNumeros = new IntTree();

        // Node<Integer> node1 = new Node(50);
        // Node<Integer> node2 = new Node(20);
        // Node<Integer> node3 = new Node(30);

        // Raiz del arbol -> node1 = 50
        // arbolNumeros.setRoot(node1);
        // node1.setRight(node2);
        // node2.setLeft(node3);

        // System.out.println(arbolNumeros.getRoot());
        // System.out.println(arbolNumeros.getRoot().getRight().getLeft());

        arbolNumeros.add(50);
        arbolNumeros.add(10);
        arbolNumeros.add(30);
        arbolNumeros.add(60);
        arbolNumeros.add(75);
        arbolNumeros.add(55);

        System.out.println("PreOrder");
        arbolNumeros.preOrden();
        System.out.println();

        System.out.println("PostOrder");
        arbolNumeros.postOrden();
        System.out.println();

        System.out.println("InOrder");
        arbolNumeros.inOrden();
        System.out.println();

        System.out.println("Altura");
        System.out.println(arbolNumeros.getHeight());
        System.out.println();

        System.out.println("Peso");
        System.out.println(arbolNumeros.getPeso());

    }
}
