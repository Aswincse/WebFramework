package com.example.q1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.q1.model.AswinBook;
import com.example.q1.service.AswinBookService;

@RestController
public class AswinBookController {
    @Autowired
    private AswinBookService bookService;

    @GetMapping("/book/{bookId}")
    public ResponseEntity<AswinBook> getBookById(@PathVariable Long bookId) {
        AswinBook book = bookService.getBookById(bookId);
        if (book != null) {
            return new ResponseEntity<>(book, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
