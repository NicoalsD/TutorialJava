package clases.c8_oop.abstraction;

public class Abstraction {
    public static void main(String[] args) {
        
        // Abstracción

        // La interfaz
        /* ya no es una clase, lo que definimos son solo los metodos a nivel declaración sin la implementación
         */

        
    }
    // - Clase abstracta

    // ocultar la implementación, declarar el método pero sin código

    // las clases abstractas no se pueden instanciar 
    public static abstract class Animal {

        // los metodos tambien se deben decir que son abstractos
        public abstract void sound();

        // - Interfaces

        public interface Flying {
            // hay una plantilla para la habilidad de volar

            void fly();
        } 
        public interface Flying2 {
            // hay una plantilla para la habilidad de volar

            void fly2();
        } 

        // se implementan con el implements
        // a nivel de clases solo soporta herencia simple, pero para interfaces si permite la implementación multiple
        public static class Bird extends Animal implements Flying, Flying2 {
            @Override
            public void sound() {
                System.out.println("pio");
            }

            @Override
            public void fly() {
                System.out.println("el pajaro vuela");
            }
            
            @Override
            public void fly2() {
                System.out.println("el pajaro vuela");
            }
        }
    }
}
