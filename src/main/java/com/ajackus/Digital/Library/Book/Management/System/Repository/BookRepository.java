package com.ajackus.Digital.Library.Book.Management.System.Repository;
import com.ajackus.Digital.Library.Book.Management.System.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// Repository interface for Book entity
interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByTitle(String title);
}