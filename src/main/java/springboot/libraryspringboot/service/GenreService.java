package springboot.libraryspringboot.service;

import org.springframework.stereotype.Service;
import springboot.libraryspringboot.dto.GenreDto;
import springboot.libraryspringboot.entity.Genre;
import springboot.libraryspringboot.repository.GenreRepository;

import static springboot.libraryspringboot.mapper.GenreMapper.mapToGenre;

@Service
public class GenreService {
    private final GenreRepository genreRepository;

    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }
    public Genre save(GenreDto genreDto){
        Genre genre=mapToGenre(genreDto);
        return genreRepository.save(genre);
    }

}
