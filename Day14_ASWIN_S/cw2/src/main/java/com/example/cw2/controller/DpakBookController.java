package com.example.cw2.controller;

import com.example.cw2.model.AswinBook;
import com.example.cw2.service.AswinBookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class AswinBookController {
    private final AswinBookService bookService;

    public AswinBookController(AswinBookService BookService) {
        this.bookService = BookService;
    }

    @PostMapping
    public ResponseEntity<AswinBook> createBook(@RequestBody AswinBook Book) {
        AswinBook createdBook = bookService.createBook(Book);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdBook);
    }

    @GetMapping
    public ResponseEntity<List<AswinBook>> getAllBooks() {
        List<AswinBook> Books = bookService.getAllBooks();
        return ResponseEntity.ok(Books);
    }
    @PutMapping("/{bookId}")
    public AswinBook updateBookById(@PathVariable Long bookId,@RequestBody AswinBook book){
        AswinBook b = bookService.updateBookById(bookId, book);
        return b;
    }
    @GetMapping("/{bookId}")
    public AswinBook getBookById(@PathVariable Long bookId) {
        AswinBook book = bookService.getBookById(bookId);
        return book;
    }
}
