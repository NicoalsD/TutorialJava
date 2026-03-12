package clases.c6_estructuras_datos;

public class Arrays {
    public static void main(String[] args) {

        int[] numeros = new int[3];
        System.out.println(numeros);

        String[] nombres = {"Nicolas", "Jeni", "Juank", "Drako", "Pato"};
        System.out.println(nombres);
        
        // Acceso
        System.out.println(numeros[0]);
        System.out.println(nombres[0]);
        
        // Modificaciones
        numeros[0] = 4;


    }
    
}
