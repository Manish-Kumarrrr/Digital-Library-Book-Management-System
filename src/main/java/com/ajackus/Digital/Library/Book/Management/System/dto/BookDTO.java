package com.ajackus.Digital.Library.Book.Management.System.dto;

// Data Transfer Object (DTO) for Book
public class BookDTO {
    private String title;
    private String author;
    private String genre;
    private String status;

    public BookDTO() {}

    public BookDTO(String title, String author, String genre, String status) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.status = status;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
