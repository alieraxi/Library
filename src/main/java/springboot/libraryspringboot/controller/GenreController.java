package springboot.libraryspringboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.libraryspringboot.dto.GenreDto;
import springboot.libraryspringboot.service.GenreService;

@RestController
@RequestMapping("/genre")
public class GenreController {
    private final GenreService genreService;

    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }
    @PostMapping("/save")
    public ResponseEntity save(@RequestBody GenreDto genreDto){
        return ResponseEntity.ok(genreService.save(genreDto));
    }
}
