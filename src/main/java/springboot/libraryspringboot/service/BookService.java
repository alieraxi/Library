package springboot.libraryspringboot.service;

import org.springframework.stereotype.Service;
import springboot.libraryspringboot.dto.BookDto;
import springboot.libraryspringboot.entity.Author;
import springboot.libraryspringboot.entity.Book;
import springboot.libraryspringboot.entity.Genre;
import springboot.libraryspringboot.repository.AuthorRepository;
import springboot.libraryspringboot.repository.BookRepository;
import springboot.libraryspringboot.repository.GenreRepository;

import java.util.ArrayList;
import java.util.List;

import static springboot.libraryspringboot.mapper.BookMapper.mapToBook;
import static springboot.libraryspringboot.mapper.BookMapper.mapToBookDto;

@Service
public class BookService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final GenreRepository genreRepository;

    public BookService(BookRepository bookRepository, AuthorRepository authorRepository, GenreRepository genreRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.genreRepository = genreRepository;
    }
    public Book save(BookDto bookDto){
        Book book=mapToBook(bookDto);
        return bookRepository.save(book);
    }
    public void delete(Long id){
        bookRepository.deleteById(id);
    }
    public BookDto getBook(Long id){
     Book book= bookRepository.findById(id).get();
     return mapToBookDto(book);
    }
    public BookDto  getBook(String name){
        Book book=bookRepository.findByName(name);
        return mapToBookDto(book);
    }
    private Author findByAuthor(String name){
        return authorRepository.findByName(name);
    }
    public List<BookDto> finByAuthorBooks(String name){
        Author author=findByAuthor(name);
        List<Book> books=bookRepository.findByAuthors(author);
        List<BookDto> bookDto=new ArrayList<>();
        for (Book book:books){
            bookDto.add(mapToBookDto(book));
        }
        return bookDto;
    }
    public void updateBook(Long id,BookDto bookDto){
        Book book=bookRepository.findById(id).get();
        book.setPrice(bookDto.getPrice());
        book.setAuthors(bookDto.getAuthors());
        book.setGenre(bookDto.getGenre());
        book.setPage(bookDto.getPage());
        book.setName(bookDto.getName());
        book.setDate(bookDto.getDate());
    }

    private Genre finByGenre(String name){
        return genreRepository.findByName(name);
    }
    public List<BookDto> findByGenre(String name){
        List<Book> books= (List<Book>) finByGenre(name);
        List<BookDto> bookDto=new ArrayList<>();
        for (Book book:books){
            bookDto.add(mapToBookDto(book));
        }
        return bookDto;
    }


}
