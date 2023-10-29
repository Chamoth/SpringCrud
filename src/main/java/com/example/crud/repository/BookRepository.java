package com.example.crud.repository;

import com.example.crud.bean.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * This interface serves as a repository for managing Book entities.
 * It extends the Spring Data CrudRepository, which provides basic CRUD operations.
 * The repository allows for easy interaction with the underlying data store.
 */
public interface BookRepository extends CrudRepository<Book, String> {

}
