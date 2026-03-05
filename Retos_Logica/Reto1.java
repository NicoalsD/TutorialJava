package Retos_Logica;
/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

public class Reto1 {
    public static void main(String[] args) {
        
        for (int index = 1; index <= 100; index++) {

            boolean multiploDeTres = index % 3 == 0;
            boolean multiploDeCinco = index % 5 == 0;
            // Podria haber simplificado más los nombres
            // no hacia falta cambiar la variable a index, con i ya bastaba
            // cuando se pone en la condición un booleano, si lo pongo solo es como decir que cuando ese booleano sea true

            if (multiploDeTres && multiploDeCinco) {
                System.out.println("fizzbuzz: " + index);
            } else if (multiploDeTres) {
                System.out.println("fizz: " + index);
            } else if (multiploDeCinco) {
                System.out.println("buzz: " + index);
            } else {
                System.out.println(index);
            }
        }
    }
}