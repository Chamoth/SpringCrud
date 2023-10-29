package com.example.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This class serves as the entry point for the Spring Boot application.
 * The @SpringBootApplication annotation indicates that this is the main application class.
 */
@SpringBootApplication
public class CrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args);
        // Start the Spring Boot application by running it with the given arguments.
    }
}
