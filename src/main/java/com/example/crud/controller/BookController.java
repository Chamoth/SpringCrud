package com.example.crud.controller;


import com.example.crud.bean.Book;
import com.example.crud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService; // Inject the BookService to handle business logic.

    // Inject the BookService to handle business logic.
    @RequestMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();

    }

    // Endpoint for adding a new book
    @RequestMapping(method = RequestMethod.POST, value = "/books")
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);

    }

    // Endpoint for updating an existing book by ID
    @RequestMapping(method = RequestMethod.PUT, value = "/books/{id}")
    public void updateBook(@PathVariable String id, @RequestBody Book book){
        bookService.updateBook(id, book);

    }

    // Endpoint for deleting a book by ID
    @RequestMapping(method = RequestMethod.DELETE, value = "/books/{id}")
    public void deleteBook(@PathVariable String id){
        bookService.deleteBook(id);

    }

}
