package clases.c8_oop.Exceptions;

public class Exceptions {
    public static void main(String[] args) {
        

        // Manejo de excepciones

        // en el try ponemos el codigo que potencialmente puede fallar

        // el scope, EL SCOPEEEE
        try {
            var resultado = 10 / 0;
            System.out.println(resultado);
        // en el parametro del catch hay que poner el tipo de error que va a capturarse

        // una practica es llamarla e

        // se pueden crear mas catch por try, para diferentes excepciones en el código  
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e);
        }



        // el programa deja de funcionar cuando hay un error

        System.out.println("Fin");
    }
}
