package Structures.Tress;

import Structures.Node.Node;

public class BinaryTree<T extends Comparable<T>> {

    private Node<T> root;
    private int peso;
 
    // Constructor
    public BinaryTree() {
        this.root = null;
        this.peso = 0;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public void setRoot(T value) {

        Node<T > node = new Node(value);
        this.root = node;

    }

    public void add(T value) {

        Node<T> node = new Node<T>(value);
        root = addRecursivo(root, node);
        peso++;

    }

    private Node<T> addRecursivo(Node<T> actual, Node<T> nodeInsertar) {

        if (actual == null)
            return nodeInsertar;

        if (actual.getValue().compareTo(nodeInsertar.getValue()) > 0) {
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

    private void preOrdenRecursivo(Node<T> actual) {

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

    private void postOrdenRecursivo(Node<T> actual) {

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

    private void inOrdenRecursivo(Node<T> actual) {

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

    private int getHeightRecursivo(Node<T> actual) {
    
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

    // private int getWeightRecursivo(Node<T> actual) {
    
    //     if(actual == null)
    //         return 0;

    //     int weightLeft = getWeightRecursivo(actual.getLeft());
    //     int weightRight = getWeightRecursivo(actual.getRight());



    //     return weightLeft + weightRight + 1;
    
    // 

}
