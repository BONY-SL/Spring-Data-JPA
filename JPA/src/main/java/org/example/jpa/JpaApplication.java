package org.example.jpa;

import org.example.jpa.models.Author;
import org.example.jpa.models.Video;
import org.example.jpa.repository.AuthorRepository;
import org.example.jpa.repository.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

   @Bean
    public CommandLineRunner commandLineRunner(AuthorRepository authorRepository,
                                               VideoRepository videoRepository){

        return args -> {
            /*var author  = Author.builder()
                    .firstName("Danidu")
                    .lastName("Tharuka")
                    .age(23)
                    .email("danidutharuka678@gmail.com")
                    .build();
            authorRepository.save(author);*/

            var video = Video.builder()
                    .name("new video")
                    .length(10)
                    .build();

            videoRepository.save(video);
        };
    }

}
