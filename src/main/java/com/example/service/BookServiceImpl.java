package com.example.service;

import com.example.entities.Book;
import com.example.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;


    @Override
    public List<Long> findAll() { return bookRepository.findAll(); }

    @Override
    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public List<Book> findByNameBook(String book) {
        return bookRepository.findByNameBook(String book);
    }


    @Override
    public List<Book> findAllByNumPagesBetween(Integer NumPagesBetween) {
        return bookRepository.findAllByNumPagesBetween(NumPagesBetween);
    }






    @Override
    public Book save(Book book) {
        return bookRepository.save(String book);
    }

    @Override
    public void deleteById(Long id) {

    }
}