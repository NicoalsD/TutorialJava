package clases.c7_bucles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Loops {
    public static void main(String[] args) {

        // Loops

        // bucle for controlado por un contador
        // for (inicializar variable; condición; como variamos el contador)
        for (int i = 1 ; i <= 5; i++) {
            System.out.println("Hola Java");
        }

        ArrayList<String> lista = new ArrayList<>();
        
        lista.add("Nicolas");
        lista.add("Churo");
        lista.add("Churo1");
        lista.add("Churo2");
        lista.add("Churo3");
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        // bucle for each
        // por cada elemento de tipo string en el recorrido de la arraylist se va a guardar temporalmente en la variable n
        // también aplica a las estructuras como maps, sets, etc
        for (String n : lista) {
            System.out.println(n);
        }

        HashMap<String, String> emails = new HashMap<>();

        emails.put("Churo", "churo@gmail.com");
        emails.put("Nico", "nici@gmail.com");

        // que, no entendí
        // entry represenra un par clave-valor
        /*
        Entry
        ├── key
        └── value

        entrySet() convierte el mapa en un conjunto de Entry.
         */
        for (Map.Entry<String,String> email: emails.entrySet()) {
            System.out.println(email.getValue());
        }

        // while
        // puede ser mas optimo que el blucle for, mientras la condición sea verdadera

        int i = 0;
        while (i < lista.size()) {
            if (lista.get(i).contains("Churo2")){
                System.out.println(lista.get(i));
                break;
            } else {
                System.out.println(lista.get(i));
                i++;
            }
        }

        // while do / do while
        // ejecutar una vez como minimo
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

        // control de bucles

        // - break: se rompe el blucle
        for (String list : lista) {
            if (list.contains("Churo2")) {
                break;
            } else {
                System.out.println(list);
            }
        }
        // - continue: para continuar, fuerza la siguiente ejecución del bucle
        for (int index = 0; index < 5; index++) {
            if (index == 3) {
                continue;
            } 
            System.out.println(index);
        }
    }
}
