public class Operadores {
    public static void main(String[] args) {
        // Operadores
        // Aritméticos

        // cuando uno de los datos ya es decimal y se operene el otro se va a tomar como
        double a = 5;
        var b = 4;

        // el + también sirve para concatenar cadenas de texto
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);

        // nos va a devolver un double
        System.out.println(a / b);
        // nos va a devolver un entero
        System.out.println(b / b);
        
        // devuelve el residuo de la división de los numeros
        System.out.println(a % b);

        // int c = 10;
        // double d = 5.6;

        // c = d; mismatch eror

        // OPERADORES DE ASGINACIÓN

        a = b; // ahora a = 4
        System.out.println(a);
        
        a = a * 2; // 4 * 2 = 8
        System.out.println(a);
        
        // se puede usar cualquier operador aritmetico
        a += 1; // 8 + 1 = 9
        System.out.println(a);
        
        a *= 2; // 9 * 2 = 18
        System.out.println(a);


        // OPERADORES RELACIONALES

        // Comparación (devuelven verdadera o falso)
        
        System.out.println(a == b); // igual a, false
        System.out.println(a != b); //diferente a, true
        
        /* el comparador de igualdad
        funciona diferente entre datos
        primitivos y objetos.
        
        Para primitivos compara el valor, para objetos compara valor en memoria. Pero en los strings entra en el loop string y compara el valor, pero si forzamos a que el string sea un objeto ya seria falso. Pero para los strings hay mas metodos como el equal*/
        
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        
        // OPERADORES LOGICOS
        
        // Y (AND)
        // el operador && va a ser true cuando todos los parametros o logica sea verdad

        
        // tabla de verdad
        
        // V %% V = V
        System.out.println(true && true);
        
        System.out.println(3 == 3 && 4 > 3);

        // V %% F = F
        System.out.println(true && false);
        
        // F %% V = F
        System.out.println(false && true);
        
        //F %% F = F
        System.out.println(false && false);


        // O (OR)

        // ||
        System.out.println(4 == 4 || 5 > 10); // true
        
        // NEGACIÓN (NOT)
        // le da la vuelta al resultado, si algo es true y lo negamos es false
        
        System.out.println(!true);
        
        System.out.println(!(4 == 4) || 5 > 10); // false

        // Unarios.

        System.out.println(b);



        
        
    }
    
}
