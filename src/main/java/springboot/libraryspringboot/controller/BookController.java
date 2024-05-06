package springboot.libraryspringboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.libraryspringboot.dto.BookDto;
import springboot.libraryspringboot.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @PostMapping("/save")
    public ResponseEntity save(BookDto bookDto){
      return ResponseEntity.ok(bookService.save(bookDto));
    }
    @GetMapping("/getId/{id}")
    public ResponseEntity<BookDto> getById(@PathVariable Long id){
        return ResponseEntity.ok(bookService.getBook(id));
    }
    @GetMapping("/getname/{name}")
    public ResponseEntity<BookDto> getByName(@PathVariable String name){
        return ResponseEntity.ok(bookService.getBook(name));
    }
    @GetMapping("/getAuthor/{AuthorName}")
    public ResponseEntity<List<BookDto>> getByAuthor(@PathVariable String name){
        return ResponseEntity.ok(bookService.finByAuthorBooks(name));
    }
    @GetMapping("/update")
    public ResponseEntity update(@PathVariable Long id, @RequestBody BookDto bookDto ){
        bookService.updateBook(id,bookDto);
        return ResponseEntity.ok("malumotlar o'zgartirldi");
    }
    @GetMapping("/get/genre")
    public ResponseEntity getGenre(@PathVariable String name){
        return ResponseEntity.ok(bookService.findByGenre(name));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        bookService.delete(id);
        return ResponseEntity.ok("kitob o'chirildi");
    }


}
