package clasejpa.ejercicios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<BookJPA, Long> {

    List<BookJPA> findByAuthor(String author);

    List<BookJPA> findByIsbn(String isbn);

    BookJPA findById(long id);
}