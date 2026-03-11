package clases.c4_strings;

public class EjerciciosStrings {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        System.out.println("Hola" + "Mundo");
        // 2. Muestra la longitud de una cadena de texto.
        System.out.println("Hola".length());
        
        // 3. Muestra el primer y último carácter de un string.
        String string = "Hola mundo";
        System.out.println("" + string.charAt(0) + string.charAt(string.length()-1)); 

        // 4. Convierte a mayúsculas y minúsculas un string.

        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
        
        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(string.contains("Hola"));
        
        
        // 6. Formatea un string con un entero.
        var age = 90;
        System.out.println(String.format("Tengo %d años", age));
        
        // 7. Elimina los espacios en blanco al principio y final de un string.
        var espacios = " Hola Java ";
        System.out.println(espacios.trim());
        
        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(espacios.replace(" ", "-"));
        
        
        // 9. Comprueba si dos strings son iguales.
        System.out.println(espacios.equals("Hola Java"));
        
        // 10. Comprueba si dos strings tienen la misma longitud.
        var string1 = "Hola";
        var string2 = "Adios";
        
        System.out.println(string1.length() == string2.length());

    }
}