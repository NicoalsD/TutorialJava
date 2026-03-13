package clases.c6_estructuras_datos;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        // como un diccionario webon
        // clave: valor

        HashMap<String, String> nombres = new HashMap<>();
        var mumeros = new HashMap<Integer, String>();

        // tamaño
        System.out.println(nombres.size());

        // añadir elementos
        // tampoco es ordenada, trabaja con hash
        nombres.put("Nicolas", "nicolas@gmail.com");
        nombres.put("Jeni", "jeni@gmail.com");
        nombres.put("Juank", "juank@gmail.com");

        System.out.println(nombres);
        System.out.println(nombres.get("Nicolas")); // una clave que no existe retorna null
        // para buscar por valor es lento, por ello no hay un metodo para eso, para hacerlo deberiamos usar un bucle para recorrer el hashmap
        
        // verificar si existe elemento
        System.out.println(nombres.containsKey("Nicolas"));
        System.out.println(nombres.containsValue("nicolas@gmail.com"));
        
        // eliminar elementos
        // no es comun borrar por clave y valor
        System.out.println("Value de la key borrada : " + nombres.remove("Nicolas"));
        System.out.println(nombres);  
        
        // limpiar
        // nombres.clear();
        // buscar mas funciones para los hashmaps
        // aprender a leer documentación
        
        // otras operaciones
        nombres.put("Nicolas", "nicolas2@gmail.com");
        System.out.println(nombres);  // al hacer un put con una clave que ya existe, se puede cambiar el value y lo va a sobreescribir, y si no expiste el key lo va a crear
        
        
        // actualizar solo si existe
        nombres.replace("Nicolas", "nicolasito@gmail.com");
        System.out.println(nombres);
        
        // y si quiero añadir un elemento verificando que no exista
        nombres.remove("Nicolas");
        nombres.putIfAbsent("Nicolas", "nicoals@gmail.com");
        System.out.println(nombres);
        System.out.println(nombres.isEmpty());

    }
}
