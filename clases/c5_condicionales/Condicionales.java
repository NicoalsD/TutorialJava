package clases.c5_condicionales;

public class Condicionales {
    public static void main(String[] args) {
        
        // condicionales

        // sentencia if
        int age = 20;

        if (age < 0) {
            System.err.println("Error: Edad inválida");
        } else if (age > 18) {
            System.out.println("Eres mayor de edad");
        } else if (age == 18) {
            System.out.println("Tienes "+age+" años");
        } else {
            System.out.println("Eres menor de edad");
        }
        
        // sentencia switch, revisando el valor de una variable
        
        var day = 8;
        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");         
                break;
                
            default:
                System.out.println("No es lunes, martes ni miercoles");         
                // break;
        }

        // ¿cuando usar if o switch?
        // noche
    }
}
