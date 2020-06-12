package clasejpa.ejercicios;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookJPA {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String isbn;
    private String author;
    private String name;

    protected BookJPA() {}

    public BookJPA(String isbn, String author, String name) {
        this.isbn = isbn;
        this.author = author;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
                "Book[id=%d, isbn='%s', author='%s', name='%s']",
                id, isbn, author, name);
    }

    public Long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }
}
