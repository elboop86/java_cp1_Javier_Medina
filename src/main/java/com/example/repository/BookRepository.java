package com.example.repository;

import com.example.entities.Author;
import com.example.entities.Book;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Long, Author> {





    List<Book> findAllByNameBook(String nameBook);

    List<Book> findAllByNumPagesBetween(Integer PagesBetween);

    List<Book> findAllByIsbn(String isbn);

    List<Book> findAllByAuthor(Author author);


    Optional<Book> findById(Long id);

    void save();

    Optional<Book> findAllById(Long id);
}
