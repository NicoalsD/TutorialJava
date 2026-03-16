package clases.c7_bucles;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class EjerciciosLoops {
    public static void main(String[] args) {
        // 1. Imprime los números del 1 al 10 usando while.
        int contador = 1;
        while (contador <= 100) {
            System.out.println(contador++);
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        ArrayList<String> valores = new ArrayList<>();
        valores.add("Nicolas");
        valores.add("Floro");
        valores.add("Churo");
        valores.add("Churo2");

        contador = 0;
        do {
            System.out.println(valores.get(contador));
            contador++;
        } while (contador < valores.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) { System.out.println(i);}
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.
        int[] numeros = {1, 2, 3, 4, 5};
        
        int suma = 0;
        for (int numero : numeros) {
            suma = suma + numero;
        }

        System.out.println(suma);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        for (int numero : numeros) { 
            System.out.println(numero);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        // - HashSet
        HashSet<String> nombresHash = new HashSet<>();
        nombresHash.add("Nicolas");
        nombresHash.add("Jacobo");
        nombresHash.add("Drako");

        for (String nombre : nombresHash) {
            System.out.println(nombre);
        }

        // - HashMap
        HashMap<String, String> emails = new HashMap<>();
        emails.put("Nicolas", "nicolas@gmail.com");
        emails.put("Nicolas2", "nicolas@gmail.com");
        emails.put("Nicolas3", "nicolas@gmail.com");

        for (Map.Entry<String,String> email : emails.entrySet()) {
            System.out.println(email);
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for (int index = 1; index <= 20; index++) {
            if (index % 3 == 0) {
                continue;
            } 
            System.out.println(index);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        int[] arrayNumeros = {1, 3, 5, -1, 3};

        for (int n : arrayNumeros) {
            if (n < 0) {
                System.out.println("Numero negativo encontrado: " + n);
                break;
            }
            System.out.println(n);
        }

        // 10. Crea un programa que calcule el factorial de un número dado.
        int numero = 10;
        int factorial = 1;
        for (int i = numero; i > 0; i--) {
            factorial = i * factorial;
        }
        System.out.println(factorial);
    }
}
