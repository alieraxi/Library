package springboot.libraryspringboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Genre {

    @Id
    private long id;
    private String name;
}