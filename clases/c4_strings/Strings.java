    package clases.c4_strings;

    public class Strings {
        public static void main(String[] args) {
            
            // Cadenas de texto

            String name = "Nicolas";

            // bucle de recalcar que es string pq es una clase
            String surname = new String("Alejandro");

            // OPERACIONES BASICAS CON STRINGS

            // concatenar
            System.out.println(name + " " + surname);
            
            // lenght: hallar la longitud del string
            System.out.println(name.length());
            
            // obtener caracter
            System.out.println(name.charAt(0));
            
            // Subcadena
            System.out.println(name.substring(1, 6));
            
            // MAYUSCULAS Y MINUSCULASSSSSS
            
            // minusculas
            System.out.println(name.toLowerCase());
            // mayusculas
            System.out.println(name.toUpperCase());
            
            
            // CONTAINS: si contiene algo
            
            System.out.println("Hola, Java".contains("Java") && "Hola, Java".contains("Python"));
            
            // equals: comparación
            System.out.println(name == "Nicolas"); // cuidado con el operador de igualdad, mejor usar equals porque compara contenido, el == compara referencias
            
            System.out.println(name.equals("nicolas")); // false, el string es una lista de chars, compara cada uno y ps deberia ser todo igual

            System.out.println(name.equalsIgnoreCase("nicolas")); // true
            
            // trim y replace -> limpieza

            // TRIM
            System.out.println(" Hola yo soy NIcolas ".trim());

            // Replace
            System.out.println(" Hola yo soy Nicolas ".replace(" ", "%")); // reemplazar
            
            var age = 18;
            System.out.println(String.format("Hola, soy %s. Tengo %d años", name, age).replace(" ", "#" )); // buscar las maneras de usar esto
        }
    }
