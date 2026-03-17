package clases.c8_funciones;

public class Funciones {
    public static void main(String[] args) {
        // Funciones
        
        for (int i = 1; i <= 5; i++) {
            sendEmail();
        }

        sendEmailTo("Nicolas");
    }

    // funciones sin parametro ni retorno
    public static void sendEmail() {
        System.out.println("Enviar Email");
    }

    // funciones con parametro 
    public static void sendEmailTo(String email) {
        System.out.println("Email enviado a "+ email);
    }

    // sobrecarga de funciones
    //las funciones estaticas solo pueden llamar otras estaticas dea
}
