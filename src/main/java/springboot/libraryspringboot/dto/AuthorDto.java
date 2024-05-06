package springboot.libraryspringboot.dto;

import lombok.Data;
import springboot.libraryspringboot.entity.Book;

import java.time.LocalDate;

import java.time.LocalDate;
import java.util.List;

@Data
public class AuthorDto {
    private String name;
    private String surName;
    private LocalDate brithDat;
    private String gender;
    private List<Book> books;
}
