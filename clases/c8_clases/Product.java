package clases.c8_clases;

// 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
public class Product {
    double precio;

    public Product(double precio) {
        this.precio = precio;
    }

    public double aplicarDescuento(int descuento) {
        var valorDescontado = precio * descuento/100;
        return precio -= valorDescontado;
    }
}
