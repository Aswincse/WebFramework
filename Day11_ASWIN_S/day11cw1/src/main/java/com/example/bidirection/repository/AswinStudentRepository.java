package com.example.bidirection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.model.AswinStudent;



@Repository
public interface AswinStudentRepository extends JpaRepository<AswinStudent,Integer>{
    
}
