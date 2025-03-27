package com.ajackus.Digital.Library.Book.Management.System.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
// Data Transfer Object (DTO) for Book
public class BookDTO {
    private String title;
    private String author;
    private String genre;
    private String status;

}