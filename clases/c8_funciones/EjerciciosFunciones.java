package clases.c8_funciones;

import java.util.ArrayList;

public class EjerciciosFunciones {
        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
        public void darBienvenida() {
            System.out.println("Bienvenido al curso de Java desde cero");
        }

        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
        public void saludarPersona(String nombre) {
            System.out.println("Hola " + nombre);
        }

        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
        public int restarDosNumeros(int n1, int n2) {
            return n1 - n2;
        }

        // 4. Crea un método que calcule el cuadrado de un número (n * n).
        public int calcularCuadrado(int numero) {
            return numero * numero;
        }

        // 5. Escribe una función que reciba un número y diga si es par o impar.
        public boolean esPar(int numero) {
            // if (numero % 2 == 0) {
            //     return true;
            // }
            // return false;
            return numero % 2 == 0; //menos verboso (sigerencia de la ia)
        }

        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
        public boolean esMayorEdad(int edad) {
            // if (edad >= 18) {
            //     return true;
            // }
            // return false;
            return edad >= 18; // menos verboso (sugerencia de la ia)
        }

        // 7. Implementa una función que reciba una cadena y retorne su longitud.
        public int darLongitudCadena(String cadena) {
            return cadena.length();
        }

        //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
        public double calcularMediaArray(int[] enteros) {
            // saber cantidad de datos
            // sumar cada digito del array
            int suma = 0;
            for (int n : enteros) {
                suma = suma + n;
            }
            return (double) suma / enteros.length; // el (double) fue por sugerencia de la ia despues de hacerlo dea
        }

        // 9. Escribe un método que reciba un número y retorna su factorial.
        public int calcularFactorial(int numero) {
            int factorial = 1;
            for (int i = numero; i > 0; i--) {
                factorial = i * factorial;
            }
            return factorial;
        }

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
        public void mostrarElementosArrayList(ArrayList<String> valores) {
            // con un for each es mas limpio btw
            for (String n : valores) {
                System.out.println(n);
            }
        }
}
