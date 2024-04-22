package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.AswinCourse;
import java.util.List;


@Repository
public interface AswinCourseRepo extends JpaRepository<AswinCourse,Integer>{

    List<AswinCourse> findByCourseName(String courseName);
    
}
