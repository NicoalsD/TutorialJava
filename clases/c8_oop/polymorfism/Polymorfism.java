package clases.c8_oop.polymorfism;

import clases.c8_oop.polymorfism.Polymorfism.Perro.Calculadora;

public class Polymorfism {

    public static void main(String[] args) { 
        // Polimorfismo
    
        // - Polimorfismo por herencia (sobreescritura)
        // redefinir un metodo de la clase padre en la clase hija

        Animal animal = new Animal();
        animal.sound();

        Perro perro = new Perro();
        perro.sound();

        // - Polimorfismo por sobrecarga (sobrecarga de métodos)
        // definir un método con mismo nombre pero con parámetros diferentes

        Calculadora calc = new Calculadora();

        calc.suma(1, 1);
        calc.suma(3);
    }

    public static class Animal {
        public void sound() {
            System.out.println("Sonido");
        }
    }

    public static class Perro extends Animal {
        @Override
        public void sound() {
            System.err.println("Woof");
        }

    public static class Calculadora {
        // - sobrecarga de métodos
        public int suma(int a, int b) {
            return a + b;
            }

        public int suma(int a) {
            return a + a;
            }

        }
    }
}
