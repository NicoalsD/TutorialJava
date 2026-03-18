package clases.c8_oop.accesmodifiers;

public class BankAccount2 {
    // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.

    private double balance = 0;

    public BankAccount2 () {}
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Succesful deposit: $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (this.balance < amount) {
            System.out.println("Insufficient funds");
        } else {
            this.balance -= amount;
            System.out.println("Succesful withdraw: $" + amount);
        }
    }
}
