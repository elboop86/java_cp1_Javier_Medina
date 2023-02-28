package com.example.repository;

import com.example.entities.Author;
import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Category> {


    List<Author> findAll();
    Optional<Author> findAllById(Long id);

    List<Author> findAllByName(String name);

    List<Author> findAllByCategory(Category category);

    List<Author> findAllByAuthor(Author author);



}