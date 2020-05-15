package clase2.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsListExample {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(3,2,1,4,5,6,6);
        // alternative you can declare the list via:
        // List<Integer> list = new ArrayList<>();
        // and use list.add(element); to add elements
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        System.out.println("Elementos de la lista 1 (Arrays):");
        for (Integer integer : list1) {
            System.out.println(integer);
        }
        System.out.println("Elementos de la lista 2 (ArrayList):");
        for (Integer integer : list2) {
            System.out.println(integer);
        }

    }

}
