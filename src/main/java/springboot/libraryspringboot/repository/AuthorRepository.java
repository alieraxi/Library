package springboot.libraryspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.libraryspringboot.entity.Author;
@Repository
public interface AuthorRepository extends JpaRepository<Author,Long> {
    Author findByName(String name);
}
