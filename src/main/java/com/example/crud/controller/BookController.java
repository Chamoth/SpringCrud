package com.example.crud.controller;


import com.example.crud.bean.Book;
import com.example.crud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();

    }

    @RequestMapping(method = RequestMethod.POST, value = "/books")
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/books/{id}")
    public void updateBook(@PathVariable String id, @RequestBody Book book){
        bookService.updateBook(id, book);

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/books/{id}")
    public void deleteBook(@PathVariable String id){
        bookService.deleteBook(id);

    }

}
