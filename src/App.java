import Materia.controllers.ArbolBinario;

public class App {
    public static void main(String[] args) throws Exception {
        ArbolBinario arbolBinario = new ArbolBinario();
        arbolBinario.insert(50);
        arbolBinario.insert(17);
        arbolBinario.insert(76);
        arbolBinario.insert(9);
        arbolBinario.insert(23);
        arbolBinario.insert(54);
        arbolBinario.insert(14);
        arbolBinario.insert(19);
        arbolBinario.imprimirArbol();
    }
}
