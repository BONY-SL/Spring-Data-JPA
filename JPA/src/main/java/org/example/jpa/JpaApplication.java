package org.example.jpa;

import com.github.javafaker.Faker;
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

/*            for(int i=1;i<=30;i++){

                Faker faker =new Faker();
                var author  = Author.builder()
                        .firstName(faker.name().firstName())
                        .lastName(faker.name().lastName())
                        .age(faker.number().numberBetween(19,25))
                        .email("danidutharuka678"+i+"@gmail.com")
                        .build();
                authorRepository.save(author);
            }*/
/*            var video = Video.builder()
                    .name("new video")
                    .length(10)
                    .build();*//*

            videoRepository.save(video);*/
        };
    }

}
