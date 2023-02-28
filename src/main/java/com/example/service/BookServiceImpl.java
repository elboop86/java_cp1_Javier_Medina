package com.example.service;

import com.example.entities.Author;
import com.example.entities.Book;
import com.example.repository.AuthorRepository;
import com.example.repository.BookRepository;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jdk.jfr.Category;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;


    @Override
    public List<Book> findAll() { return bookRepository.findAll();}

    @Override
    public Optional<Book> findAllById(Long id) {
        return bookRepository.findAllById(id);
    }

    @Override
    public List<Book> findAllByNameBook(String nameBook) {
        return bookRepository.findAllByNameBook( nameBook);
    }

    @Override
    public List<Book> findAllByCategory(String category) {
        return null;
    }



    @Override
    public List<Book> findAllByIsbn(Double isbn) {
        return bookRepository.findAllByIsbn("isbn" );
    }

    @Override
    public List<Book> findAllByAuthor(Author author) {
        return bookRepository.findAllByAuthor(author);
    }


    @Override
    public Book save(Book book) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}