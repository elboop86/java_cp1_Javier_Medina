package com.example;

import com.example.entities.Author;
import com.example.entities.Book;
import com.example.repository.AuthorRepository;
import com.example.repository.BookRepository;
import jakarta.persistence.ManyToOne;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@SpringBootApplication
public class App {
    static ApplicationContext context;

    public static void main(String[] args) { context = SpringApplication.run(App.class, args);

    }
    /**
     * Many To One
     * Many smartphones to One person
	 */
    @ManyToOne
    private static void ManyToOne() {

        var bookRepo = context.getBean(BookRepository.class);


        Book book1 = new Book(null,"HTML","Programacion",25);
        Book book2 = new Book(null,"CSS","Diseño",30);
        Book book3 = new Book(null,"JavaScript","Programacion",35);

        bookRepo.saveAll(List.of(book1,book2,book3));


        var authorRepo = context.getBean(AuthorRepository.class);
        var author1 = new Author(null,"Luis","Programacion",2);
        var author2 = new Author(null,"Pepe","Diseño",3);
        authorRepo.saveAll(List.of(author1,author2));


    }


}

