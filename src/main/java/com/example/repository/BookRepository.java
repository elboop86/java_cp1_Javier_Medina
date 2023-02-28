package com.example.repository;

import com.example.entities.Author;
import com.example.entities.Book;
import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Long, Author> {


    List<Book> findAll(Long id);
    Optional<Book> findAllById(Long id);
    List<Book> findAllByNameBook(String nameBook);

    List<Book> findAllByCategory(Category category);

    List<Book> findAllByIsbn(String isbn);

    List<Book> findAllByAuthor(Author author);



}
