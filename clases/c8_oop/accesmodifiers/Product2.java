package clases.c8_oop.accesmodifiers;

public class Product2 {
    // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.

    private double price;
    
    public Product2(double price) {
        this.price = price;
    }

    public double getPrice() {return price;}
    
    public void setPrice(double price) {
        if (price >= 0) {this.price = price;}
    }
}
