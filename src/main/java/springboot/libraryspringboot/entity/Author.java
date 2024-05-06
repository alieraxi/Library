package springboot.libraryspringboot.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Entity
@Data
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String surName;
    private LocalDate brithDat;
    private String gender;

    @ManyToMany
    @JoinTable(name = "author_book",
    joinColumns = {@JoinColumn(name = "author_id",referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "book_id",referencedColumnName = "id")})
    private List<Book> books;
}