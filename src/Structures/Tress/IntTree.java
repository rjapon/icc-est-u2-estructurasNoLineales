package Structures.Tress;

import Structures.Node.Node;

// Clase de arbol de enteros
public class IntTree {

    private Node<Integer> root;
    private int peso;

    // Constructor
    public IntTree() {
        this.root = null;
        this.peso = 0;
    }

    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> root) {
        this.root = root;
    }

    public void setRoot(Integer value) {

        Node<Integer> node = new Node(value);
        this.root = node;

    }

    public void add(int value) {

        Node<Integer> node = new Node<Integer>(value);
        root = addRecursivo(root, node);
        peso++;

    }

    private Node<Integer> addRecursivo(Node<Integer> actual, Node<Integer> nodeInsertar) {

        if (actual == null)
            return nodeInsertar;

        if (actual.getValue() > nodeInsertar.getValue()) {
            // Izq
            actual.setLeft(addRecursivo(actual.getLeft(), nodeInsertar));
        } else {
            // Der
            actual.setRight(addRecursivo(actual.getRight(), nodeInsertar));
        }

        return actual;

    }

    // PreOrden
    public void preOrden() {

        preOrdenRecursivo(root);

    }

    private void preOrdenRecursivo(Node<Integer> actual) {

        if (actual == null)
            return;

        System.out.println(actual);

        preOrdenRecursivo(actual.getLeft());
        preOrdenRecursivo(actual.getRight());

    }

    // PostOrden
    public void postOrden() {

        postOrdenRecursivo(root);

    }

    private void postOrdenRecursivo(Node<Integer> actual) {

        if (actual == null)
            return;

        postOrdenRecursivo(actual.getLeft());
        postOrdenRecursivo(actual.getRight());

        System.out.println(actual);

    }

    // InOrden
    public void inOrden() {

        inOrdenRecursivo(root);

    }

    private void inOrdenRecursivo(Node<Integer> actual) {

        if (actual == null)
            return;

        inOrdenRecursivo(actual.getLeft());
        System.out.println(actual); 
        inOrdenRecursivo(actual.getRight());

    }

    // Altura del arbol
    public int getHeight(){

        return getHeightRecursivo(root);

    }

    private int getHeightRecursivo(Node<Integer> actual) {
    
        if(actual == null)
            return 0;

        int heightLeft = getHeightRecursivo(actual.getLeft());
        int heightRight = getHeightRecursivo(actual.getRight());

        int masAlto = Math.max(heightLeft, heightRight);

        return masAlto + 1;

    }

    // public int getWeight(){

    //     return getWeightRecursivo(root);

    // }

    public int getPeso(){

        return peso;

    }

    // private int getWeightRecursivo(Node<Integer> actual) {
    
    //     if(actual == null)
    //         return 0;

    //     int weightLeft = getWeightRecursivo(actual.getLeft());
    //     int weightRight = getWeightRecursivo(actual.getRight());



    //     return weightLeft + weightRight + 1;
    
    // }

}