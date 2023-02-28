package com.example.service;

import com.example.entities.Author;
import com.example.entities.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> findAll();
    Optional<Book> findAllById(Long id);

    List<Book> findAllByNameBook(String nameBook);

    List<Book> findAllByCategory(String category);

    List<Book> findAllByIsbn(Double isbn);

    List<Book> findAllByAuthor(Author author);

    Book save(Book book);

    void deleteById(Long id);


}
