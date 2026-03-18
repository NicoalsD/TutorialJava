package clases.c8_oop.clases_ejercicios;

// 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
public class Rectangle {
    double largo; 
    double ancho;

    public Rectangle(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double calcularArea() {
        return largo * ancho;
    }

    public double calcularPerimetro() {
        return (largo*2) + (ancho*2);
    }
}
