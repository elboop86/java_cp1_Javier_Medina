package com.example.java_cp1_Javier_Medina.service;

import com.example.java_cp1_Javier_Medina.Entity.Book;

import java.util.List;

public interface BookOperationService {
    
    // CRUD
    
    List<Book> findAll();
}
