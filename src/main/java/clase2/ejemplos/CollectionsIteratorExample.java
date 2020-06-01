package clase2.ejemplos;

import java.util.*;

public class CollectionsIteratorExample {

    public static void main(String[] args) {

        LinkedList<CollectionsEstudiante> lista = new LinkedList<>();
        lista.add(new CollectionsEstudiante("Juan", 85));
        lista.add(new CollectionsEstudiante("Maria", 45));
        lista.add(new CollectionsEstudiante("Pedro", 51));
        ListIterator<CollectionsEstudiante> iterador = lista.listIterator();
        while (iterador.hasNext()) {
            CollectionsEstudiante e = iterador.next();
            System.out.println(e.getName());
        }
        System.out.println("sigo con el mismo iterador");
        while (iterador.hasPrevious()) {
            CollectionsEstudiante e = iterador.previous();
            System.out.println(e.getName());
        }

    }

}
