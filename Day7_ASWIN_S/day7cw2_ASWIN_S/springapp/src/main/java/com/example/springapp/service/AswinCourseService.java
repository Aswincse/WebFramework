package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.AswinCourse;
import com.example.springapp.repository.AswinCourseRepo;

@Service
public class AswinCourseService {
    @Autowired
    private AswinCourseRepo rep;

    public boolean post(AswinCourse person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<AswinCourse> getAll()
    {
        return rep.findAll();
    }

    public List<AswinCourse> getbyAge(String courseName)
    {
        return rep.findByCourseName(courseName);
    }
    
}
