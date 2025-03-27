package com.ajackus.Digital.Library.Book.Management.System.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

// Entity representing a Book
@Entity
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String author;

    private String genre;

    @Column(nullable = false)
    private String status;

    public Book(String title, String author, String genre, String status) {
        this.title=title;
        this.author=author;
        this.genre=genre;
        this.status=status;
    }
}