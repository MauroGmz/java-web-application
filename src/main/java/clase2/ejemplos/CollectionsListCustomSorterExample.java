package clase2.ejemplos;

import java.util.*;

public class CollectionsListCustomSorterExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5,4,3,7,2,1);
        // custom comparator
        Collections.sort(list, (o1, o2) -> (o1>o2 ? -1 : (o1==o2 ? 0 : 1))); // Ordena los números de mayor a menor
        // alternative can could reuse the integer comparator
        // Collections.sort(list);
        list.forEach(System.out::println);
        System.out.println(list);
        Collections.sort(list);                     // Se ordenan los números de la lista de menor a mayor
        list.forEach(System.out::println);
        System.out.println(list);

    }

}
