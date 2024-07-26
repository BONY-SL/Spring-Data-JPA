package org.example.jpa.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "Author")
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue/*(strategy = GenerationType.TABLE,
            generator = "author_id_gen"
    )*/

    /*@SequenceGenerator(name = "author_sequence",
    sequenceName = "author_sequence",
    allocationSize = 1)*/

    /*@TableGenerator(
            name = "author_id_gen",
            table = "id_generator",
            pkColumnName = "id_name",
            valueColumnName = "id_value",
            allocationSize = 1
    )*/
    private Integer id;


    @Column(name = "first_name")
    private String firstName;


    @Column(name = "last_name")
    private String lastName;


    @Column(unique = true,nullable = false)
    private String email;


    private int age;


    //@Column(updatable = false,nullable = false)
    //private LocalDateTime createdAt;

    //@Column(insertable = false)
    //private LocalDateTime lastModified;

}
