package com.example.crud.service;


import com.example.crud.bean.Book;
import com.example.crud.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    public BookRepository bookRepo;

    public List<Book> getAllBooks(){
        List<Book> books = new ArrayList<>();
        bookRepo.findAll().forEach(books::add);
        return books;
    }

    public void addBook(Book book){
        bookRepo.save(book);
    }

    public void updateBook(String id, Book book){
        bookRepo.save(book);
    }


    public void deleteBook(String id) {
        bookRepo.deleteById(id);
    }
}
