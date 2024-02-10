package com.example.javaproject.author;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorService {

    AuthorRepository authorRepository;



    @Autowired
            AuthorService(AuthorRepository repostory){
        this.authorRepository = repostory;
    }

    Optional<Author> findAuthorById(Long id){
        return authorRepository.findById(id);
    }

    void save(Author author){
        authorRepository.save(author);
    }

}
