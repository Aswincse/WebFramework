package com.example.q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.q1.model.AswinBook;
@Repository
public interface AswinBookRepository extends JpaRepository<AswinBook, Long> {
}
