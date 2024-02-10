package com.example.javaproject.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class BookService {

    BookRepostory bookRepostory;
    @Autowired
    BookService(BookRepostory repostory){
        this.bookRepostory = repostory;
    }

    Optional<Book> findBookById(Long id){
        return bookRepostory.findById(id);
    }



}
