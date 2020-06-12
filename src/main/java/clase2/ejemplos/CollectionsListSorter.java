package clase2.ejemplos;

import java.util.Arrays;
import java.util.List;

public class CollectionsListSorter {

    public static void main(String[] args) {

        System.out.println("Primer caso con list1:");
        List<String> l1 = createList();
        l1.sort(null);
        l1.forEach(System.out::println);

        System.out.println("Segundo caso con list2:");
        List<String> l2 = createList();
        l2.sort((s1, s2) -> s1.compareToIgnoreCase(s2));    //Ordena el ArrayList en orden alfabético usando una función lambda
        l2.forEach(System.out::println);

        System.out.println("Tercer caso con list3:");
        List<String> l3 = createList();
        l3.sort(String::compareToIgnoreCase);               //Ordena el ArrayList en orden alfabético
        l3.forEach(System.out::println);

    }

    private static List<String> createList() {

        return Arrays.asList("iPhone", "Ubuntu", "Android", "Mac OS X");

    }

}
