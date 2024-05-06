package springboot.libraryspringboot.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import springboot.libraryspringboot.entity.Author;
import springboot.libraryspringboot.entity.Genre;

import java.time.LocalDate;
import java.util.List;
@Data
public class BookDto {
    private String name;
    private Genre genre;
    private List<Author> authors;
    private int page;
    private LocalDate date;
    private double price;
}
