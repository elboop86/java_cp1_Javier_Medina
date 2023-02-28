package com.example.java_cp1_Javier_Medina.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String Author;
    private String genero;
    private String editorial;



public Book() {

}

    public Book(Long id, String author, String genero, String editorial) {
        this.id = id;
        Author = author;
        this.genero = genero;
        this.editorial = editorial;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", Author='" + Author + '\'' +
                ", genero='" + genero + '\'' +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}



