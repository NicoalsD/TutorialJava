package clases.c8_oop.clases_ejercicios;

// 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
public class BankAccount {
    double balance = 0;

    public BankAccount() { }

    public void deposit(double saldo) {
        this.balance += saldo;
    }
}
