package com.ajackus.Digital.Library.Book.Management.System.controller;

import com.ajackus.Digital.Library.Book.Management.System.Service.BookService;
import com.ajackus.Digital.Library.Book.Management.System.dto.BookDTO;
import com.ajackus.Digital.Library.Book.Management.System.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// REST Controller for managing book-related endpoints
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    // Endpoint to add a new book
    @PostMapping("/add")
    public Book addBook(@RequestBody BookDTO bookDTO) {
        return bookService.addBook(bookDTO);
    }

    // Endpoint to retrieve all books
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    // Endpoint to retrieve a book by ID
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    // Endpoint to search for a book by title
    @GetMapping("/search")
    public Book getBookByTitle(@RequestParam String title) {
        return bookService.getBookByTitle(title);
    }

    // Endpoint to update book details
    @PutMapping("/update/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody BookDTO bookDTO) {
        return bookService.updateBook(id, bookDTO);
    }

    // Endpoint to delete a book from the library
    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}
