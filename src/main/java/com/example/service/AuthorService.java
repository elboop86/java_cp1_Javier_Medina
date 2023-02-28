package com.example.service;

import com.example.entities.Author;
import jdk.jfr.Category;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    List<Author> findAll();
    Optional<Author> findAllById(Long id);

    List<Author> findAllByName(String name);

    List<Author> findAllByCategory(Category category);

    List<Author> findAllByAuthor(Author author);

    Author save(Author author);

    void deleteById(Long id);
}
