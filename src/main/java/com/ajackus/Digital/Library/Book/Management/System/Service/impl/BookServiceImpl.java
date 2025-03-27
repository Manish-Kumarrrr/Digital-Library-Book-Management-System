package com.ajackus.Digital.Library.Book.Management.System.Service.impl;


import com.ajackus.Digital.Library.Book.Management.System.Repository.BookRepository;
import com.ajackus.Digital.Library.Book.Management.System.Service.BookService;
import com.ajackus.Digital.Library.Book.Management.System.dto.BookDTO;
import com.ajackus.Digital.Library.Book.Management.System.entity.Book;
import com.ajackus.Digital.Library.Book.Management.System.exception.BookNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Service layer handling business logic
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    // Retrieve all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Retrieve a book by its ID
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException("Book not found"));
    }

    // Retrieve a book by its title
    public Book getBookByTitle(String title) {
        return bookRepository.findByTitle(title).orElseThrow(() -> new BookNotFoundException("Book not found"));
    }

    // Add a new book to the library
    public Book addBook(BookDTO bookDTO) {
        if (bookDTO.getTitle().isEmpty() || bookDTO.getAuthor().isEmpty()) {
            throw new IllegalArgumentException("Title and Author cannot be empty");
        }
        Book book = new Book(bookDTO.getTitle(), bookDTO.getAuthor(), bookDTO.getGenre(), bookDTO.getStatus());
        return bookRepository.save(book);
    }

    // Update book details
    public Book updateBook(Long id, BookDTO bookDTO) {
        Book book = getBookById(id);
        book.setTitle(bookDTO.getTitle());
        book.setAuthor(bookDTO.getAuthor());
        book.setGenre(bookDTO.getGenre());
        book.setStatus(bookDTO.getStatus());
        return bookRepository.save(book);
    }

    // Delete a book from the library
    public void deleteBook(Long id) {
        if (!bookRepository.existsById(id)) {
            throw new BookNotFoundException("Book not found");
        }
        bookRepository.deleteById(id);
    }
}

