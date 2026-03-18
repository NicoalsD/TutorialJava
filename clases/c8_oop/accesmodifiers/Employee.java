package clases.c8_oop.accesmodifiers;

public class Employee {
    // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.

    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double percent) {
        if (percent >= 0) {
            var raise = this.salary * percent/100;
            this.salary += raise;
            System.out.println("salary raised %" + percent);
        } else {
            System.out.println("Only positive percent");
        }
    }
}
