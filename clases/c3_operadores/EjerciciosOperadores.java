package clases.c3_operadores;
public class EjerciciosOperadores {
    public static void main(String[] args) {
        // 1. Crea una variable con el resultado de cada operación aritmética.

        // 2. Crea una variable para cada tipo de operación de asignación.
        int numero = 5;

        numero += 1;
        numero -= 1;
        numero *= 1;
        numero /= 1;
        numero %= 1;

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.

        System.out.println((1 + 1) == 2);
        System.out.println(2 > 1);
        System.out.println(4 < 10);
        
        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(4 > 10);
        System.out.println(4 >= 10);
        System.out.println((4 + 4) == 6);
        
        // 5. Utiliza el operador lógico and.
        System.out.println(4 + 4 == 8 && 2 * 4 == 8);
        
        // 6. Utiliza el operador lógico or.
        System.out.println(1 + 1 == 3 || 3 + 3 == 6);
        
        // 7. Combina ambos operadores lógicos.
        System.out.println(1 + 1 == 3 && 1 + 1 == 2 || 3 + 3 == 6 && 1 + 2 == 4);
        
        // 8. Añade alguna negación.
        System.out.println(1 + 1 != 3);
        
        // 9. Imprime 3 ejemplos de uso de operadores unarios.

        var a = 5;
        System.out.println(a++);
        System.out.println("a: " + a); // 6

        var b = -1;
        System.out.println(++b);
        System.out.println(b--);
        System.out.println("b: " + b);
        System.out.println(b); // -1
        
        System.out.println(a + b);
        
        
        // 10. Combina operadores aritméticos, de comparación y lógicos.
        
        var c = 3;
        var d = 4;

        System.out.println((c + d != 7 && c - d == -1) || (c + d > 8 || c + d < 8));
    }
}
