package clase2.ejemplos;

import java.util.Set;
import java.util.TreeSet;

public class CollectionsTreeSetExample {

    public static void main(String[] args) {

        Set treeSet = (Set) new TreeSet();      // TreeSet implementa la interfaz de Set
        treeSet.add("Volvo");
        System.out.println(treeSet);
        // Alphabetical order
        treeSet.add("Audi");                    // TreeSet es una estructura de árbol con elementos ordenados
        System.out.println(treeSet);
        treeSet.add("Ford");
        System.out.println(treeSet);
        // Volvo is Duplicate. So will not be added. returns false.
        treeSet.add("Volvo");// returns false since element is not added - El método add de la interfaz de Set no permite el agregado de elementos ya existentes
        System.out.println(treeSet);// [Audi, Ford, Volvo]

    }

}
