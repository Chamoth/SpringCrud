package com.example.crud.repository;

import com.example.crud.bean.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, String> {



}
