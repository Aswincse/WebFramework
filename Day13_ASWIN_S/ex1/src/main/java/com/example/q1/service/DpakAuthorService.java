package com.example.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.AswinAuthor;
import com.example.q1.repository.AswinAuthorRepository;

@Service
public class AswinAuthorService {
    @Autowired
    private AswinAuthorRepository authorRepository;

    public AswinAuthor saveAuthor(AswinAuthor author) {
        return authorRepository.save(author);
    }

    public AswinAuthor getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<AswinAuthor> getAllAuthors() {
        return authorRepository.findAll();
    }

    public AswinAuthor updateAuthor(Long id, AswinAuthor author) {
        AswinAuthor existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
