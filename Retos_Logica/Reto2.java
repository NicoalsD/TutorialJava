package Retos_Logica;
public class Reto2 {
    // de un string, se debe mostra el primer caracter y los demás enmascararlos con un asterisco
    public static void main(String[] args) {
        String nombre = "Juan";
        String resultado = "";

        for (int i = 0; i < nombre.length(); i++) {
            if (i == 0) {
                resultado += nombre.charAt(0);
            } else {
                resultado += "*";
            }
        }
        System.out.println(resultado);
    }

    
}