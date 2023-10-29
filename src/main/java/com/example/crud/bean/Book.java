package com.example.crud.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Books")
public class Book {

    @Id
    private String id;  // Unique identifier for the book.
    private String name;  // The name or title of the book.

    public Book() {
        // Default constructor.
    }

    public Book(String id, String name) {
        this.id = id;  // Initialize the book's ID.
        this.name = name;  // Initialize the book's name.
    }

    // Getter for the book's ID.
    public String getId(){
        return id;
    }

    // Setter for the book's ID.
    public void setId(String id) {
        this.id = id;
    }

    // Getter for the book's name.
    public String getName() {
        return name;
    }

    // Setter for the book's name.
    public void setName(String name) {
        this.name = name;
    }
}
