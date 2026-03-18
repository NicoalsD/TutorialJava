package clases.c8_oop;

import java.util.ArrayList;

import clases.c8_oop.clases_ejercicios.BankAccount;
import clases.c8_oop.clases_ejercicios.Book;
import clases.c8_oop.clases_ejercicios.Car;
import clases.c8_oop.clases_ejercicios.Dog;
import clases.c8_oop.clases_ejercicios.Person;
import clases.c8_oop.clases_ejercicios.Product;
import clases.c8_oop.clases_ejercicios.Rectangle;
import clases.c8_oop.clases_ejercicios.Student;
import clases.c8_oop.clases_ejercicios.Worker;

public class ClasesEjercicios {
    public static void main(String[] args) {
        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        var Libro1 = new Book("Curso de Java", "Mouredev");
        System.out.println("Titulo del libro: " + Libro1.titulo + "\nAutor del libro: " + Libro1.autor);

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        var PerroHP = new Dog();
        PerroHP.bark(); // Woof

        // 3. Añade un constructor a la clase Book que reciba title y author.
        // ya lo hice xd

        // 4. Crea una clase Car con atributos brand y model y un método showData().
        var carromk = new Car("Toyota", "2025");
        carromk.showData();

        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
        var estudiantemk = new Student(50);
        System.out.println(estudiantemk.siAprobo());

        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
        var cuenta1 = new BankAccount();
        cuenta1.deposit(100000);
        System.out.println("$"+cuenta1.balance);

        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        var rectangulogey = new Rectangle(10, 5);
        System.out.println("Area: " + rectangulogey.calcularArea());
        System.out.println("Perimetro: " + rectangulogey.calcularPerimetro());

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
        var trabajador = new Worker("Nicoals", 10000);
        System.out.println(trabajador.getSalario());

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        var persona1 = new Person("Nicolas", "Diaz");
        var persona2 = new Person("Nicolas", "Diaz");
        var persona3 = new Person("Nicolas", "Diaz");

        ArrayList<Person> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona3);
        personas.add(persona2);

        System.out.println(personas); // para que se printeen bien las clases deben tener el toString

        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
        var quesito = new Product(100000);
        System.out.println(quesito.aplicarDescuento(10));
    }
}
