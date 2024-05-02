package com.example.cw2.service;

import com.example.cw2.model.AswinBook;
import com.example.cw2.repository.AswinBookRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AswinBookService {
    private final AswinBookRepo bookRepo;

    public AswinBookService(AswinBookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public AswinBook createBook(AswinBook Book) {
        return bookRepo.save(Book);
    }
    public List<AswinBook> getAllBooks() {
        return bookRepo.findAll();
    }
    public AswinBook getBookById(Long id) {
        return bookRepo.findById(id).orElse(null);
    }
    public AswinBook updateBookById(Long id,AswinBook book){
        AswinBook b = bookRepo.findById(id).orElse(null);
        if(b!=null){
            b.setAuthor(book.getAuthor());
            b.setAvailableCopies(book.getAvailableCopies());
            b.setTitle(book.getTitle());
            b.setTotalCopies(book.getTotalCopies());
            bookRepo.save(b);
        }
        return b;
    }
}
