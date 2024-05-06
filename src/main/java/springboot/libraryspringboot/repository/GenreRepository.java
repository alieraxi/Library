package springboot.libraryspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.libraryspringboot.entity.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre,Long> {
    Genre findByName(String name);
}
