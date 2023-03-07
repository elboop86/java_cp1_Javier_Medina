package com.example.controller;

import com.example.entities.Book;
import com.example.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Controller
public class BookController {
    private final BookService bookService;

    @GetMapping("books") // GET http://localhost:8080/books
    public String findAll(Model model) {
        List<Long> books = bookService.findAll();
        model.addAttribute("books", books);
        return "book-list";
    }
    @GetMapping("books/{id}") // http://localhost:8080/books/1
    public String findById(Model model, @PathVariable Long id) {
        Optional<Book> bookOpt = bookService.findById(id);
        if (bookOpt.isPresent())
            model.addAttribute("book", bookOpt.get());
        else
            model.addAttribute("error", "Book not found");

        return "book-detail";
    }

    @GetMapping("books/nameBook") // http://localhost:8080/books/color/verde
    public String findByNameBook(Model model, @PathVariable String book){
        model.addAttribute("books", bookService.findByNameBook(book));
        return "book-list";
    }

    @GetMapping("books/PagesBetween") // http://localhost:8080/books/color/verde
    public String findByNumPagesBetween(Model model, @PathVariable Integer PagesBetween){
        model.addAttribute("books", bookService.findByNameBook(String.valueOf(PagesBetween)));
        return "book-list";
    }

    @PostMapping("books") // POST http://localhost:8080/books
    public String saveForm(@ModelAttribute String book) {
        bookService.save(book);
        return "redirect:/books"; // Redirección a GET /books
    }

    @GetMapping("books/{id}/delete")
    public String deleteById(@PathVariable Long id) {
        bookService.deleteById(id);
        return "redirect:/books";
    }


}
