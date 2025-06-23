package com.books.books.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.books.books.models.Book;
import com.books.books.repositories.BookRepository;

@Service
public class BookService {

    private BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public List<Book> allBooks() {
        return repo.findAll();
    }

    public Book createBook(Book book) {
        return repo.save(book);
    }

    public Book findBook(Long id) {

        Optional<Book> book = repo.findById(id);
        if (book.isPresent()) {
            return book.get();
        } else {
            return null;
        }
    }

    public Book updateBook(Book book) {

        return repo.save(book);
    }

    public void deleteBook(Long id) {
        repo.deleteById(id);
    }
}
