# Práctica: Estructuras de datos no lineales

## Datos del Estudiante
- **Nombre:** Richard Japón
- **Curso:** Grupo 1
- **Fecha:** 19/06/2026

---

## 1. Implementacion de un arbol binario generico -> BinaryTree<T>


**Fecha:** 19/06/2026
**Descripción:** Se realizo una clase BinaryTree con un tipo generico T que extiende de Comparable<T> para poder comparar los valores y mantener el orden del arbol. Se implementaron los metodos add, preOrden, postOrden, inOrden, getHeight y getPeso. Se realizo una clase Persona que implementa Comparable<Persona> para poder comparar las personas por edad y nombre. Se realizo un metodo runBinaryTree para probar la clase BinaryTree con String y Persona.

```java

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

```
## 2. Implementacion de un arbol de enteros


**Fecha:** 22/06/2026
**Descripción:** Se implemento un metodo que sirve para ordenar e imprimir un arbol de enteros, se imprimio de manera horizontal empezando por la rama derecha hasta la izquierda. En el segundo ejercicio se implementaron dos metodos, uno para imprimir el arbol original de manera horizontal, y el otro para invertirlo.

## Ejercicio 1

```java

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

```
## Ejercicio 2

```java

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

```
