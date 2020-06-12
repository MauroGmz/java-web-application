package clasejpa.ejercicios;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ejercicio10Application {

	private static final Logger log = LoggerFactory.getLogger(Ejercicio10Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio10Application.class, args);
	}

	@Bean
	public CommandLineRunner toPersist(BookRepository repository) {
		return (args) -> {
			// save a few books
			repository.save(new BookJPA("97804355", "Robert C. Martin", "Clean code"));
			repository.save(new BookJPA("97803535", "Andy Hunt & Dave Thomas", "The pragmatic programmer"));
			repository.save(new BookJPA("97805656", "Gamma, Helm, Johnson & Vlissides", "Design Patterns"));
			repository.save(new BookJPA("97806565", "Jeff Patton", "User Story Mapping"));
			repository.save(new BookJPA("97805353", "Eric Evans", "Domain Driven Design"));
			repository.save(new BookJPA("97805355", "Eric Evans", "Domain Driven Design Reference"));

			// fetch all books
			log.info("Books found with findAll():");
			log.info("-------------------------------");
			for (BookJPA book : repository.findAll()) {
				log.info(book.toString());
			}
			log.info("");

			// fetch an individual book by ID
			BookJPA book = repository.findById(1L);
			log.info("Book found with findById(1L):");
			log.info("--------------------------------");
			log.info(book.toString());
			log.info("");

			// fetch book by author
			log.info("Book found with findByAuthor('Eric Evans'):");
			log.info("--------------------------------------------");
			repository.findByAuthor("Eric Evans").forEach(a -> {
				log.info(a.toString());
			});

			log.info("");
		};
	}

}
