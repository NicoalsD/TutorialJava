package clases.c8_oop.accesmodifiers;

public class Car {
    // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).

    private double speed;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void accelerate(int amount) {
        if (amount > 120) {
            System.out.println("La velocidad máxima a subir es 120");
        } else {
            this.speed += amount;
            System.out.println("Velocidad aumentada: " + amount);
        }
    }
    
    public void brake(int amount) {
        if (amount < 0) {
            System.out.println("La velocidad mínima a disminuir es 0");
        } else {
            this.speed -= amount;
            System.out.println("Velocidad disminuida: " + amount);
        }
    }
}
