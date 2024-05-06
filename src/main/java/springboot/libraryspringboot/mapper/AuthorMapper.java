package springboot.libraryspringboot.mapper;

import springboot.libraryspringboot.dto.AuthorDto;
import springboot.libraryspringboot.entity.Author;

public class AuthorMapper {
    public static Author mapToAuthor(AuthorDto authorDto){
        Author author=new Author();
        author.setName(authorDto.getName());
        author.setBooks(authorDto.getBooks());
        author.setGender(authorDto.getGender());
        author.setSurName(authorDto.getSurName());
        author.setBrithDat(authorDto.getBrithDat());
        return author;
    }
    public static AuthorDto mapToAuthorDto(Author authorDto){
        AuthorDto author=new AuthorDto();
        author.setName(authorDto.getName());
        author.setBooks(authorDto.getBooks());
        author.setGender(authorDto.getGender());
        author.setSurName(authorDto.getSurName());
        author.setBrithDat(authorDto.getBrithDat());
        return author;
    }
}
