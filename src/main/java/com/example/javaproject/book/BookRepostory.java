package com.example.javaproject.book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepostory extends JpaRepository<Book,Long> {

}
