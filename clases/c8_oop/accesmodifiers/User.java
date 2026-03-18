package clases.c8_oop.accesmodifiers;

public class User {
    // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.

    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void checkPassword(String password) {
        if (this.password.equals(password)) {
            System.out.println("Correct password");
        } else {
            System.out.println("Wrong password");
        }
    }
}
