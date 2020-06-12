package clase2.ejercicios;

import java.util.*;

public class EjerciciosCollections {

    public static void main(String[] args) {

        // Ejercicio 4.1 - Realizar una lista de compras con arraylist e imprimirla

        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("Drinks");
        shoppingList.add("candies");
        shoppingList.add("meat");
        shoppingList.add("pasta");

        for(String list: shoppingList)
            System.out.println(list);


        // Ejercicio 4.2 - Realizar un catálogo de libros por isbn como clave, y recuperar e imprimir la información del
        //mismo.

        Map<String, String> map = new HashMap<>();
        fillData(map);
        map.forEach((k, v) -> System.out.printf("%s %s%n", k, v));


        // Ejercicio 4.3 - Realizar una impresión del ingreso de números de documento en una mesa de elecciones en
        //un treeset, e imprimirla al final.

        Set documentNumbers = new TreeSet();

        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese documento o 'fin' para terminar:");
        String text = reader.next();
        while (!text.equals("fin")) {
            documentNumbers.add(text);
            System.out.println("Número de documento: " + text);
            System.out.println("Ingrese documento o 'fin' para terminar:");
            text = reader.next();
        }
        System.out.println(documentNumbers);

    }

    private static void fillData(Map<String, String> map){
        map.put("97804355...", "Clean code");
        map.put("97803535...", "The pragmatic programmer");
        map.put("97805656...", "Design Patterns");
        map.put("97806565...", "User Story Mapping");
        map.put("97805353...", "Domain Driven Design");
    }

}
