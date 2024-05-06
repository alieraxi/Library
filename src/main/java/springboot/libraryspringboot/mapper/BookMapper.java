package springboot.libraryspringboot.mapper;

import springboot.libraryspringboot.dto.BookDto;
import springboot.libraryspringboot.entity.Book;

public class BookMapper {
    public static Book mapToBook(BookDto bookDto){
        Book book=new Book();
        book.setName(bookDto.getName());
        book.setDate(bookDto.getDate());
        book.setPage(bookDto.getPage());
        book.setGenre(bookDto.getGenre());
        book.setPrice(bookDto.getPrice());
        book.setAuthors(bookDto.getAuthors());
        return book;
    }
    public static BookDto mapToBookDto(Book bookDto){
        BookDto book= new BookDto();
        book.setName(bookDto.getName());
        book.setDate(bookDto.getDate());
        book.setPage(bookDto.getPage());
        book.setGenre(bookDto.getGenre());
        book.setPrice(bookDto.getPrice());
        book.setAuthors(bookDto.getAuthors());
        return book;
    }
}
