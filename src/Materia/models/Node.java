package Materia.models;

public class Node {

    private Node left;
    private Node right;
    private int peso;
    private int value;

    public Node(int value) {
        this.left = null;
        this.right = null;
        this.value = value;
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node [Left: " + left + ", Right: " + right + ", Value: " + value + "]";
    }
}
