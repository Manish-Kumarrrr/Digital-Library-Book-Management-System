package com.ajackus.Digital.Library.Book.Management.System.Service;

import com.ajackus.Digital.Library.Book.Management.System.dto.BookDTO;
import com.ajackus.Digital.Library.Book.Management.System.entity.Book;

import java.util.List;

// Interface for BookService
public interface BookService {

    // Retrieve all books
    List<Book> getAllBooks();

    // Retrieve a book by its ID
    Book getBookById(Long id);

    // Retrieve a book by its title
    Book getBookByTitle(String title);

    // Add a new book to the library
    Book addBook(BookDTO bookDTO);

    // Update book details
    Book updateBook(Long id, BookDTO bookDTO);

    // Delete a book from the library
    void deleteBook(Long id);
}