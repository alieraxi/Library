package springboot.libraryspringboot.service;

import org.springframework.stereotype.Service;
import springboot.libraryspringboot.dto.AuthorDto;
import springboot.libraryspringboot.entity.Author;
import springboot.libraryspringboot.repository.AuthorRepository;

import static springboot.libraryspringboot.mapper.AuthorMapper.mapToAuthor;
import static springboot.libraryspringboot.mapper.AuthorMapper.mapToAuthorDto;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
    public Author save(AuthorDto authorDto){
        return authorRepository.save(mapToAuthor(authorDto));
    }
    public AuthorDto getAuthorId(Long id){
        return mapToAuthorDto(authorRepository.findById(id).get());
    }
    public AuthorDto getAuthorName(String name){
        Author author=authorRepository.findByName(name);
        return mapToAuthorDto(author);
    }

}
