package com.kodilla.spring.library;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibraryConfig {
    @Bean
    public Library library() {
        System.out.println("Lib config Library");
        return new Library(libraryDbController());
    }

    @Bean
    public LibraryDbController libraryDbController() {
        System.out.println("Lib config LibraryDbController");
        return new LibraryDbController();
    }
}
