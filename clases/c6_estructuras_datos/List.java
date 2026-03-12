package clases.c6_estructuras_datos;
import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        // una solución mas felxible que el array normal

        // declaración y creación
        ArrayList<String> nombres = new ArrayList<>();
        var numeros = new ArrayList<Integer>();
        // tipos de datos primitivos equivalente en clase

        // tamaño
        System.out.println(nombres.size()); // 0
        
        // añadir elementos
        nombres.add("Nicolas"); // index 0
        nombres.add("Juanso");
        nombres.add("Jeni");

        System.out.println(nombres.getFirst());
        System.out.println(nombres.get(1));
        System.out.println(nombres.getLast());
        
        // modificar los elementos
        nombres.set(0, "Pene");
        System.out.println(nombres.getFirst());
        
        // eliminar 
        nombres.remove(0);
        System.out.println(nombres.getFirst());
        System.out.println(nombres.contains("Jeni"));

        // Limmpiar arraylist
        nombres.clear();
        System.out.println(nombres.size()); // ir revisando metodos

        // trabajar lo que se pueda con arrayList, por que antes por las limitaciones de los sistemas era normal usar arrays
    }
}
