package com.example;

import com.example.entities.Author;
import com.example.entities.Book;
import com.example.entities.BookBuilder;
import com.example.repository.AuthorRepository;
import com.example.repository.BookRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class App {


    public static void main(String[] args) {ApplicationContext context = SpringApplication.run(App.class, args);


        var bookRepo = context.getBean(BookRepository.class);
        Book book1 = new BookBuilder().setO(null).setJavaScript("HTML").setProgramacion("Programacion").setI(25).createBook();
        Book book2 = new BookBuilder().setO(null).setJavaScript("CSS").setProgramacion("Diseño").setI(30).createBook();
        Book book3 = new BookBuilder().setO(null).setJavaScript("JavaScript").setProgramacion("Programacion").setI(35).createBook();
        bookRepo.saveAll(List.of(book1, book2, book3));


        var authorRepo = context.getBean(AuthorRepository.class);
        var author1 = new Author(null,"Luis","Programacion",2);
        var author2 = new Author(null,"Pepe","Diseño",3);
        authorRepo.saveAll(List.of(author1,author2));


    }

    }


