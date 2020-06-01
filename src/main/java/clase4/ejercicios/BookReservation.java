package clase4.ejercicios;

import java.util.List;

public class BookReservation {

    public static void main(String[] args) {

        BookJDBC bookJDBC = new BookJDBC();
        List<Book> books = bookJDBC.select();

        for(Book book: books){
            System.out.println("libro: "+ book);
        }

        // Insertar los libros
        /*
        Book book1 = new Book(97804355, "Robert C. Martin", "Clean code");
        Book book2 = new Book(97803535, "Andy Hunt & Dave Thomas", "The pragmatic programmer");
        Book book3 = new Book(97805656, "Gamma, Helm, Johnson & Vlissides", "Design Patterns");
        Book book4 = new Book(97806565, "Jeff Patton", "User Story Mapping");
        Book book5 = new Book(97805353, "Eric Evans", "Domain Driven Design");

        bookJDBC.insert(book1);
        bookJDBC.insert(book2);
        bookJDBC.insert(book3);
        bookJDBC.insert(book4);
        bookJDBC.insert(book5);
        */

        // Prueba del update
        Book book = new Book(123123, "Autor1", "Libro1");

        bookJDBC.update(book);

    }

}
