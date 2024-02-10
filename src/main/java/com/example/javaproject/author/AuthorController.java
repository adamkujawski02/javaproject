package com.example.javaproject.author;

import com.example.javaproject.book.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class AuthorController {

    AuthorService authorService;

    AuthorController(AuthorService service){
        this.authorService = service;

        this.authorService.save(new Author(123L, "Nigger", "Pedalski", new ArrayList<Book>()));
    }

    @GetMapping("/author/{id}")
    Optional<Author> getAuthorById(@PathVariable Long id){
        return authorService.findAuthorById(id);
    }
}
