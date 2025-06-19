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
        
        System.out.println("Nombre: Brandon Collaguazo");
        System.out.println("");
        System.out.println("La altura del árbol es: " + arbolBinario.getHeight());
        System.out.println("El peso del árbol es: " + arbolBinario.peso());
        System.out.println("");
        arbolBinario.imprimirArbol();
        System.out.println("");
        arbolBinario.imprimirWithHeight();
        System.out.println();
        arbolBinario.imprimirFactoresEquilibrio();
        System.out.println("");
        System.out.println("El árbol está equilibrado = " + arbolBinario.desequilibrio());
        System.out.println("Agregamos valor 15");
        arbolBinario.insert(15);
        System.out.println("");
        arbolBinario.imprimirFactoresEquilibrio();
        arbolBinario.imprimirDesequilibrados();
    }
}
