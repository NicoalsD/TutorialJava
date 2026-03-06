public class TipoDeDato {
    public static void main(String[] args) {
        // Tipo de datos primitivos

        int myInt = 18;
        System.out.println(myInt);
        
        double myDouble = 1.77; // float, long, byte, etc
        System.out.println(myDouble);
    
        
        // char hace referencia a un solo caracter
        
        // comilla simple para char
        // las comillas dobles son para string
        // No se utiliza con mucha frecuencia

        // los char almacenan uni code
        char myChar = '6';
        char myCharUnicode = 65;
        System.out.println(myChar);
        System.out.println(myCharUnicode); // En consola se muestra como una "A"
        
        boolean MyBoolean = true;
        MyBoolean = false;
        System.out.println(MyBoolean);
        
        // la cadena de texto es tan utilziado que se dice que es un dato primitivo, pero eb vdd es una clase. EN otros lenguajes si es un primitivo.

        // el string es una secuencia de char. OMGGGG

        // El string es una clase por que maneja metodos para los strings
        
        String myString = "hola";
        System.out.println(myString);
        
        
        // Tipo de dato en tiempo de compilación
        
        // m hay mecanismos para saber que tipo de dato es una variable
        
        // los primitivos también existen como clase

        
        System.out.println(myString.getClass());

        System.out.println(myString.getClass().getSimpleName());
        
    }
}