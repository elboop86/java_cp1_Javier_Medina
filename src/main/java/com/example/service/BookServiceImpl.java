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
        return bookRepository.findAllById(id);
    }

    @Override
    public List<Book> findByNameBook(String book) {
        return bookRepository.findAllByNameBook(book);
    }

    @Override
    public List<Book> findByNumPagesBetween(Integer NumPagesBetween) {
        return bookRepository.findAllByNumPagesBetween(NumPagesBetween);
    }




    @Override
    public void save(String book) {
        bookRepository.save();
    }

    @Override
    public void deleteById(Long id) {

    }
}