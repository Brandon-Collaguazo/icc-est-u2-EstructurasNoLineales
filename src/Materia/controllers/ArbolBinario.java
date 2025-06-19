package Materia.controllers;

import Materia.models.Node;

public class ArbolBinario {

    private Node root;
    private int pesoTotal;

    public ArbolBinario() {
        this.root = null;
        this.pesoTotal = 0;
    }

    public void insert(int value) {
        root = insertRec(root, value);
        pesoTotal++;
    }

    private Node insertRec(Node padre, int value) {
        if(padre == null) {
            return new Node(value);
        }

        if(value < padre.getValue()) {
            //Me voy a la izquierda
            padre.setLeft(insertRec(padre.getLeft(), value));

        } else if(value > padre.getValue()) {
            //Me voy a la derecha
            padre.setRight(insertRec(padre.getRight(), value));
        }

        return padre;
    }

    public void imprimirArbol() {
        System.out.println("Arbol InOrder");
        imprimirInOrder(root);
        System.out.println("");
    }

    private void imprimirInOrder(Node node) {
        if(node != null) {
            imprimirInOrder(node.getLeft());
            System.out.print(node.getValue() + ", ");
            imprimirInOrder(node.getRight());
        }
    }

    public void imprimirWithHeight() {
        System.out.println("Arbol InOrder con alturas");
        imprimirConAltura(root);
        System.out.println("");
    }

    private void imprimirConAltura(Node node) {
        if(node != null) {
            imprimirConAltura(node.getLeft());
            System.out.print(node.getValue() + "(h = " + getHeightRec(node) + "), ");
            imprimirConAltura(node.getRight());
        }
    }

    public void imprimirFactoresEquilibrio() {
        System.out.println("Arbol InOrder con factor de equilibrio");
        imprimirFE(root);
        System.out.println("");
    }

    private void imprimirFE(Node node) {
        if (node != null) {
            imprimirFE(node.getLeft());
            System.out.print(node.getValue() + "(BF: " + factorEquilibrio(node) + "), ");
            imprimirFE(node.getRight());
        }
    }

    public void imprimirDesequilibrados() {
        System.out.print("Nodos desequilibrados ");
        imprimrDesequilibrados(root);
        System.out.println("");
    }

    private void imprimrDesequilibrados(Node node) {
        if(node != null) {
            imprimrDesequilibrados(node.getLeft());
            int fe = factorEquilibrio(node);
            if(fe < -1 || fe > 1) {
                System.out.print(node.getValue() + "(FE= " + fe + "), ");
            }
            imprimrDesequilibrados(node.getRight());
        }
    }

    public boolean buscar(int value) {
        return buscarRec(root, value);
    }

    private boolean buscarRec(Node node, int value) {
        if (node == null) {
            return false;
        } 
        if (value == node.getValue()) {
            return true;
        }
        if (value < node.getValue()) {
            return buscarRec(node.getLeft(), value);
        } else {
            return buscarRec(node.getRight(), value);
        }
    }

    public int getHeight() {
        return getHeightRec(root);
    }

    private int getHeightRec(Node node) {
        if(node == null) {
            return 0;
        }

        int leftHeight = getHeightRec(node.getLeft());
        int rightHeight = getHeightRec(node.getRight());
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int peso() {
        return pesoTotal;
    }

    public int factorEquilibrio(Node node) {
        if(node == null) {
            return 0;
        }
        return getHeightRec(node.getLeft()) - getHeightRec(node.getRight());
    }

    public boolean desequilibrio() {
        return desequilibrioRec(root);
    }

    private boolean desequilibrioRec(Node node) {
        if(node == null) {
            return true;
        }
        int fe = factorEquilibrio(node);
        return (fe >= -1 && fe <= 1) && desequilibrioRec(node.getLeft()) && desequilibrioRec(node.getRight());
    }
}
