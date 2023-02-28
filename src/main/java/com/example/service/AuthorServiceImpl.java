package com.example.service;

import com.example.entities.Author;
import com.example.repository.AuthorRepository;
import jdk.jfr.Category;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@AllArgsConstructor
@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;


    @Override
    public List<Author> findAll() { return authorRepository.findAll();
    }

    @Override
    public Optional<Author> findAllById(Long id) {
        return authorRepository.findAllById(id);
    }

    @Override
    public List<Author> findAllByName(String name) {
        return authorRepository.findAllByName(name);
    }

    @Override
    public List<Author> findAllByCategory(Category category) {
        return authorRepository.findAllByCategory(category);
    }

    @Override
    public List<Author> findAllByAuthor(Author author) {
        return authorRepository.findAllByAuthor(author);
    }

    @Override
    public Author save(Author author) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
