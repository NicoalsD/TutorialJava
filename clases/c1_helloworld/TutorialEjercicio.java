package clases.c1_helloworld;
import java.util.Scanner;

public class TutorialEjercicio {
    public static void main(String[] args) {
        // 1. Imprime tu nombre en vez de "Hola Mundo"
        System.out.println("Nicolas Alejandro 67 Dihaz");

        // 2. Imprime dos lineas: "Hola" y "Mundo" con un solo println

        System.out.println("Hola \nMundo");

        // 3. Añade un comentario sobre lo que hace cada linea del programa

        //otei

        // 4. Crea un comentario en varias lineas

        /*
        Este es un comentario
        de 
        varias lineas
        */

        // 5. Imprime tu edad, tu color favorito y tu cuidad.
        System.out.println("18" + " Pasto" + " Negro");

        // 6. Explora los diferentes system xxx println además del out

        /*
        existen tres streams standar:
        - out -> salida
        - in -> entrada
        - err -> errores
        */

        // como usar el system.in
        // se importa el Scanner (clase)

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Tu nombre es: " + nombre);

        // como usar el system.err
        // simplemente un out pero el sistema lo interpreta diferente, se usa para especificar errores

        System.err.println("Error: usted es muy gruapo y eso daño el sistema");
        
        // 7. Utiliza varios println para imprimir una frase
        
        System.out.println("Esta es una frase durisima 3 veces");
        System.out.println("Esta es una frase durisima 3 veces");
        System.out.println("Esta es una frase durisima 3 veces");

        // 8. Imprime un diseño ASCII.

        System.out.println("""
         .______.
        /        \\
        |   ° °   |\\  CUACK
        |         |/
        \\________/
        """);

        // 9. Intenta ejecutar el programa sin el método main y observa el error.
        // da todo error dea

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
        // no compila
    }
}

