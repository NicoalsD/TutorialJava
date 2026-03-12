package clases.c6_estructuras_datos;

import java.util.HashSet;

public class Set {
    // los estructuras set son habituales en poo
    // son una estructura especial que almacena datos unicos
    // no va a permitir duplicados

    public static void main(String[] args) {
        

        // como declarar un set
        HashSet<String> nombres = new HashSet<>();
        var numeros =  new HashSet<Integer>();

        // tamaño
        nombres.add("Nicolas");
        nombres.add("Jeni");
        nombres.add("Juan");
        System.out.println(nombres.size());
        // las listas son ordenadas, los sets son desorndeadas, los objetos se guardan por hash, sirven para acceder a datos de manera muy rapida
        
        // eliminar elementos
        nombres.remove("Nicolas");
        System.out.println(nombres);
        System.out.println(nombres.contains("Nicolas"));
        
        // buscar
        nombres.add("Nicolas");
        nombres.add("Nicolas");
        nombres.add("Nicolas");
        // se guardan en el mismo hash, va a comprobar si existe un hash asociado a ese add
        System.out.println(nombres);
        System.out.println(nombres.contains("Nicolas"));

        // trabajo con conjuntos
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        // nombres.addAll(numeros); error incompativbilidad de datos

        var paises = new HashSet<String>();
        paises.add("Colombia");
        // NI CON EL ADD ALL SE REPITEN DATOS
        nombres.addAll(paises);
        System.out.println(nombres);
        
        nombres.removeAll(paises); // elimina todos elementos del set de paises
        System.out.println(nombres);
    }
}
