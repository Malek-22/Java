package com.books.books.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.books.books.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findAll();
}