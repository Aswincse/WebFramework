package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.AswinStudent;
import java.util.List;


@Repository
public interface AswinStudentRepo extends JpaRepository<AswinStudent,Integer>{

    List<AswinStudent> findByMarksGreaterThan(int marks); 
    List<AswinStudent> findByMarksLessThan(int marks); 
}
