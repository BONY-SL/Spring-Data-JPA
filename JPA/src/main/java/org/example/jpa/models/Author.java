package org.example.jpa.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity("Author")
@Table("author")
public class Author {

    @Id
    private Integer id;


    private String firstName;


    private String lastName;


    private String email;


    private int age;

}
