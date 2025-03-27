package com.ajackus.Digital.Library.Book.Management.System.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

//Custom Exception for Book Not Found
@ResponseStatus(code = org.springframework.http.HttpStatus.NOT_FOUND)
public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String message) {
        super(message);
    }
}