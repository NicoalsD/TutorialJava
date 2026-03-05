/*
Aqui voy a aprender Java durisimo
Cursito de 8 horas de mouredev. https://www.youtube.com/watch?v=JOAqpdM36wI&list=PLNdFk2_brsRen1cN3cndq-WUZDAztFrFy
*/

public class VariablesYConstantes {
    public static void main(String[] args) {
        // COmentarios
        System.out.println("Hola Mundo");

        // Variables
        // cadena de texto
        // TipoDeDato, nombre = valor;
        String name = "Nicolas";
        System.out.println(name);

        // actualizar valor de una variable

        name = "Alejandro";
        System.out.println(name);

        // name = 17; no funciona porque Java tiene un tipado fuerte y no se puede mezclar un tipo de dato con otro, esa variable no va a cambiar de tipo de dato nunca

        int age = 18;

        System.out.println("Tu edad es: " + age);
        

        var variable = "el tipo de dato se infiere segun lo que esté guardado en la variable"; // String
        var año = 2025; //int
        // Constantes
        
        final String EMAIL = "nicolas@gmail.com";
        // email = "alejandro@gmail.com"; ya no es posible porque con el final la variable se vuelve constante. Una buena practica es poner todas las constantes en mayúsculas
        System.out.println(EMAIL);
    }
}
