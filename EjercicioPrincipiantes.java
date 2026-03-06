public class EjercicioPrincipiantes {
    public static void main(String[] args) {
        // 1. Declara una variable de tipo String y asígnale tu nombre.

        String nombre = "nombre";
        // 2. Crea una variable de tipo int y asígnale tu edad.

        int edad = 18;

        // 3. Crea una variable double con tu altura en metros.
        double altura = 1.78;

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean meGustaProgramar = true;

        // 5. Declara una constante con tu email.
        final String EMAIL = "nicolas@gmail.com";

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char inicialNombre = 'N';

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String localidad = "Pasto";
        localidad = "Linares";
        System.out.println(localidad);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 1;
        int b = 5;
        Integer c = a + b;
        System.out.println(c);
        
        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(localidad.getClass().getSimpleName());
        System.out.println(nombre.getClass().getSimpleName());
        System.out.println(c.getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        String variable;
        variable = "variable";
        System.out.println(variable);
    }
}
