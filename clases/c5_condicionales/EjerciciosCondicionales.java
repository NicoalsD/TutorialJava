package clases.c5_condicionales;

public class EjerciciosCondicionales {
    public static void main(String[] args) {
        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        int edad = 17;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad. Puedes votar");
        } else {
            System.out.println("Eres menor de edad. No puedes votar");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        var a = 10;
        var b = 10;

        if (a > b) {
            System.out.println(a);
        } else if (a == b) {
            System.out.println("a y b son iguales");
        } else {
            System.out.println(b);
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.

        var n = 7;

        if (n < 0) {
            System.out.println(n + " es un numero negativo");
        } else if (n == 0) {
            System.out.println("n es 0");
        } else {
            System.out.println(n + " es positivo");
        }

        // 4. Crea un programa que diga si un número es par o impar.

        int c = 7;

        if (c % 2 == 0) {
            System.out.println("c es par");
        } else {
            System.out.println("c es impar");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.

        var r = 70;

        if (r < 1 || r > 100) {
            System.out.println("No esta en el rango de 1 a 100");
        } else {
            System.out.println("Esta en el rango de 1 a 100");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.

        int diaSemana = 4;
        switch (diaSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
                
            default:
                System.out.println("Ese día no existe");
                break;
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        double nota = 40;
        
        if (nota <= 100 && nota >= 80) {
            System.out.println("Sobresaliente");
        } else if (nota < 80 && nota >= 60) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        var edadCine = 10;
        boolean vaAcompañado = true;

        if ((edadCine >= 15) || (edadCine < 15 && vaAcompañado == true)) {
            System.out.println("Puedes entrar al cine");
        } else {
            System.out.println("No puedes entrar al cine");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        char letra = 'c';
        switch (letra) {
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println("Es vocal");
                break;    
            default:
                System.out.println("Es consonante");
                break;
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

        var x = 11;
        var y = 10;
        var z = 3;

        if (x == y && x == z) {
            System.out.println("Todas son iguales");
        } else if (x > y && x > z) {
            System.out.println("x es el numero mas grande");
        } else if (y > x && y > z) {
            System.out.println("y es el numero mas grande");
        } else if (z > x && z > y) {
            System.out.println("z es el numero mas grande");
        }
    }
}
