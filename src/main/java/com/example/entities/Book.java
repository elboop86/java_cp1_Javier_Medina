package com.example.entities;

import jakarta.persistence.*;
import jdk.jfr.Category;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;




import jakarta.persistence.Entity;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nameBook;
    @OneToOne
    private Category category;

    @OneToOne
    @JoinColumn(name= "isbn")
    private String isbn;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    public Book(Object o, String javaScript, String programacion, int i) {
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id.equals(book.id) && nameBook.equals(book.nameBook) && category.equals(book.category) && isbn.equals(book.isbn) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameBook, category, isbn, author);
    }
}

