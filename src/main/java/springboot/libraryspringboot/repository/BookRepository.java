package springboot.libraryspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.libraryspringboot.entity.Author;
import springboot.libraryspringboot.entity.Book;
import springboot.libraryspringboot.entity.Genre;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    Book findByName(String name);
    List<Book> findByAuthors(Author author);
    List<Book> findByGenre(Genre genre);
}
