import Models.Persona;
import Structures.Node.Node;
import Structures.Tress.BinaryTree;
import Structures.Tress.IntTree;

public class App {
    public static void main(String[] args) throws Exception {

        runIntTree();

        runBinaryTree();

    }

    private static void runBinaryTree() {
        
        BinaryTree<String> arbolStrings = new BinaryTree<>();
        BinaryTree<Persona> arbolPersonas = new BinaryTree<>();
        
        arbolPersonas.add(new Persona("Pablo",30));
        arbolPersonas.add(new Persona("Ana",25));
        arbolPersonas.add(new Persona("Luis",35));
        arbolPersonas.add(new Persona("Maria",28));

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
