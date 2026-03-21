package clases.c8_oop.polymorfism;

import java.util.ArrayList;
import java.util.Arrays;

import javax.rmi.ssl.SslRMIServerSocketFactory;

public class Polymorphism {
    public static void main(String[] args) {
        var animal = new Animal();
        animal.makeSound();

        var perro = new Dog();
        perro.makeSound();

        var gato = new Cat();
        gato.makeSound();

        var circulo = new Circle();
        var rectangulo = new Rectangle();
        double[] figuritas = {circulo.getArea(), rectangulo.getArea()};
        System.out.println(Arrays.toString(figuritas));

        var print1 = new Printer();

        print1.imp("hola");
        print1.imp(2);
        print1.imp(2.5);

        var saludador = new Greeter();
        saludador.greet();
        saludador.greet("Nicolas");

        var carro = new Car();
        var bike = new Bike();
        var truck = new Truck();

        ArrayList<Vehicle> vehiculos = new ArrayList<>();
        vehiculos.add(carro);
        vehiculos.add(bike);
        vehiculos.add(truck);

        System.out.println(vehiculos);
        for (Vehicle v : vehiculos) {
            v.start();
        }

        var sms = new SMSNotification();
        sendNotification(sms);

        showAnimalType(perro);

        var convertidor = new Converter();
        convertidor.convert("HOLA");

    }
    
    // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método desde una lista de Animal.
    public static class Animal {
        public void makeSound() {
            System.out.println("Sonido");
        }
    }

    public static class Dog extends Animal {

        @Override
        public void makeSound() {
            System.out.println("Woof");
        }
    }

    public static class Cat extends Animal {

        @Override
        public void makeSound() {
            System.out.println("Miau");
        }
    }

    // 2. Crea una clase Shape con el método calculateArea(). Luego implementa subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape para recorrer e imprimir el área de varias figuras.
    public static abstract class Shape {
        double area;
        public abstract void calculateArea();

        public double getArea() {
            return area;
        }
    }

    public static class Circle extends Shape {
        public double radio;

        @Override
        public void calculateArea() {
            this.area = Math.PI * Math.pow(radio, 2);
        }
    }
    
    public static class Rectangle extends Shape {
        public double height;
        public double width;

        @Override
        public void calculateArea() {
            this.area = height * width;
        }
    }
    
    // 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten diferentes tipos de parámetros (String, int, double). Llama a cada uno desde main.
    public static class Printer {
        public void imp(String valor) {
            System.out.println(valor);
        }
        public void imp(int valor) {
            System.out.println(valor);
        }
        public void imp(double valor) {
            System.out.println(valor);
        }
    }

    // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con “Hello”, y otro que reciba un nombre y salude con “Hello, [nombre]”.
    public static class Greeter {
        public void greet() {
            System.out.println("Hola");
        }
        public void greet(String nombre) {
            System.out.println("Hola " + nombre);
        }
    }

    // 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
    public static class Vehicle {
        public void start() {
            System.out.println("El vehiculo arrancó");
        }
    }

    public static class Car extends Vehicle {
        @Override
        public void start() {
            System.out.println("El carro arrancó");
        }
    }
    public static class Bike extends Vehicle {
        @Override
        public void start() {
            System.out.println("La bicicleta arrancó");
        }
    }
    public static class Truck extends Vehicle {
        @Override
        public void start() {
            System.out.println("El camión arrancó");
        }
    }

    // 6. Crea una clase Notification con método send(), y subclases EmailNotification, SMSNotification. Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.

    public static class Notificacion {
        public void send(){
            System.out.println("Notificación enviada");
        }
    }

    public static class EmailNotification extends Notificacion {
        @Override
        public void send() {
            System.out.println("Notificación por email enviada");
        }
    }
    public static class SMSNotification extends Notificacion {
        @Override
        public void send() {
            System.out.println("Notificación por SMS enviada");
        }
    }

    public static void sendNotification(Notificacion n) {
        n.send();
    }

    // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.

    public static void showAnimalType(Animal animal) {
        System.out.println(animal.getClass().getSimpleName());
    }

    // 8. Crea una clase Converter con métodos convert(int), convert(double), y convert(String) que devuelvan diferentes formatos de texto.

    public static class Converter {
        public void convert(int n) {
            System.out.println("Entero: " + n);
        }

        public void convert(double n) {
            System.out.println("Double: " + String.format("%.5f", n));
        }

        public void convert(String n) {
            System.out.println("Texto: " + n.toLowerCase());
        }
    }

    // 9. Crea una clase Product con el método getPrice(). Luego, Book y Electronic deben sobrescribirlo con su propia lógica de descuento. Recorre una lista de Product e imprime el precio final de cada uno.
    public static class Product {
        double price;

        public double getPrice() {
            return price;
        }
    }

    // 10. Crea una clase Character con método attack(). Luego crea subclases Warrior, Archer, Mage con ataques diferentes. En main, crea un array de Character y llama a attack() para cada uno.

    public static class Character {
        public void attack() {
            System.out.println("Ataque lanzado");
        }
    }

    // ya no quiero hacer más

    public static class Warrior extends Character {
        @Override
        public void attack() {
            System.out.println("El guerrero atacó");
        }
    }
}
