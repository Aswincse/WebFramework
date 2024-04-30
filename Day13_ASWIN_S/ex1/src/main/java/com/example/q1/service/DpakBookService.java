package com.example.q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.AswinAuthor;
import com.example.q1.model.AswinBook;
import com.example.q1.repository.AswinAuthorRepository;
import com.example.q1.repository.AswinBookRepository;

@Service
public class AswinBookService {
    @Autowired
    private AswinBookRepository bookRepository;
@Autowired
private AswinAuthorRepository authorRepository;
    public AswinBook saveBook(Long authorId, AswinBook book) {
        AswinAuthor author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public AswinBook getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

