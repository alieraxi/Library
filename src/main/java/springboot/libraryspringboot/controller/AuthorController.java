package springboot.libraryspringboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.libraryspringboot.dto.AuthorDto;
import springboot.libraryspringboot.service.AuthorService;

@RestController
@RequestMapping("/author")
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody AuthorDto authorDto){
        return ResponseEntity.ok(authorService.save(authorDto));
    }
    @GetMapping("/get/{id}")
    public ResponseEntity getById(@RequestParam Long id){
        return ResponseEntity.ok(authorService.getAuthorId(id));
    }
    @GetMapping("/get/{name}")
    public ResponseEntity getByName(@RequestParam String name){
        return ResponseEntity.ok(authorService.getAuthorName(name));
    }
}
