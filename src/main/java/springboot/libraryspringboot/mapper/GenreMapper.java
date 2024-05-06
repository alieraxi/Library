package springboot.libraryspringboot.mapper;

import springboot.libraryspringboot.dto.GenreDto;
import springboot.libraryspringboot.entity.Genre;

public class GenreMapper {
    public static Genre mapToGenre(GenreDto genreDto){
        Genre genre=new Genre();
        genre.setName(genreDto.getName());
        return genre;
    }
}
