package springboot.libraryspringboot.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @OneToOne
    private Genre genre;
    @ManyToMany
    @JoinTable(name = "book_author",
            joinColumns = {@JoinColumn(name = "book_id",referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "author_id",referencedColumnName = "id")})
    private List<Author> authors;
    private int page;
    private LocalDate date;
    private double price;
}
