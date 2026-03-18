package clases.c8_oop.clases_ejercicios;

// 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
public class Worker {
    String nombre;
    double salario;

    public Worker(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double getSalario() { return salario; }
}
