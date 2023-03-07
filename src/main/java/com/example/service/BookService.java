package com.example.service;

import com.example.entities.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Long> findAll();

    Optional<Book> findById(Long id);

   List<Book> findByNameBook(String book);

    List<Book> findByNumPagesBetween(Integer NumPagesBetween);

    void save(String book);

    void deleteById(Long id);



}
