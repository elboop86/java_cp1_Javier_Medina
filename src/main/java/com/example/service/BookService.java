package com.example.service;

import com.example.entities.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Long> findAll();

    Optional<Book> findById(Long id);

   List<Book> findByNameBook(String book);

    List<Book> findAllByNumPagesBetween(Integer NumPagesBetween);

    Book save(Book book);

    void deleteById(Long id);



}
