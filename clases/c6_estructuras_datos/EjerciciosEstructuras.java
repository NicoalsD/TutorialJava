package clases.c6_estructuras_datos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class EjerciciosEstructuras {
    public static void main(String[] args) {
        // 1. Crea un Array con 5 valores e imprime su longitud.
        int[] valores = {1, 2, 3, 4 , 5};
        System.out.println(Arrays.toString(valores));
        System.out.println(valores.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println(valores[0]);
        valores[0] = 10;
        System.out.println(valores[0]);

        // 3. Crea un ArrayList vacío.
        ArrayList<String> lista = new ArrayList<>();

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.

        lista.add("Nicolas");
        lista.add("Nicolas1");
        lista.add("Nicolas2");
        lista.add("Nicolas3");

        lista.remove("Nicolas");
        System.out.println(lista);

        // 5. Crea un HashSet con 2 valores diferentes.
        HashSet<String> hashito = new HashSet<>();
        hashito.add("Jeni");
        hashito.add("Juansote");
        
        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        hashito.add("Juansote");
        hashito.add("Drako");
        
        // 7. Elimina uno de los elementos del HashSet.
        hashito.remove("Juansote");

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        HashMap<String, String> daticos = new HashMap<>();
        daticos.put("Patico", "321");
        daticos.put("Jose", "123");
        daticos.put("Bombini", "333");

        // 9. Modifica uno de los contactos y elimina otro.
        daticos.replace("Patico", "Ticopa");
        System.out.println(daticos);
        daticos.remove("Bombini");
        System.out.println(daticos);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.

        // Tranformar Array en ArrayList

        Integer[] numeritosArray = {10, 11, 12};
        System.out.println(numeritosArray);

        ArrayList<Integer> numeritosList = new ArrayList<Integer>(Arrays.asList(numeritosArray));
        System.out.println(numeritosList);

        // Transformar HashSet a HashMap
        // hay que usar un hijueputa for each aja

        var hashote = new HashSet<Integer>();
        hashote.add(5);
        hashote.add(6);
        hashote.add(7);
        hashote.add(8);

        System.out.println(hashote);

        var mapsote = new HashMap<Integer, Integer>();

        for(Integer n : hashote) {
            mapsote.put(n, n);
        }

        System.out.println(mapsote);
    }
}
