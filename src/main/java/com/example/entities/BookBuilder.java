package com.example.entities;

import jdk.jfr.Category;

public class BookBuilder {
    private Object o;
    private String javaScript;
    private String programacion;
    private int i;
    private Long id;
    private String nameBook;
    private Integer pagesBetween;
    private Category category;
    private String isbn;
    private Author author;

    public BookBuilder setO(Object o) {
        this.o = o;
        return this;
    }

    public BookBuilder setJavaScript(String javaScript) {
        this.javaScript = javaScript;
        return this;
    }

    public BookBuilder setProgramacion(String programacion) {
        this.programacion = programacion;
        return this;
    }

    public BookBuilder setI(int i) {
        this.i = i;
        return this;
    }

    public BookBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public BookBuilder setNameBook(String nameBook) {
        this.nameBook = nameBook;
        return this;
    }

    public BookBuilder setPagesBetween(Integer pagesBetween) {
        this.pagesBetween = pagesBetween;
        return this;
    }

    public BookBuilder setCategory(Category category) {
        this.category = category;
        return this;
    }

    public BookBuilder setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public BookBuilder setAuthor(Author author) {
        this.author = author;
        return this;
    }

    public Book createBook() {
        return new Book(o, javaScript, programacion, i);
    }
}