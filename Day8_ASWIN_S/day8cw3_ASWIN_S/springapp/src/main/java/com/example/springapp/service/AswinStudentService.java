package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.AswinStudent;
import com.example.springapp.repository.AswinStudentRepo;

@Service
public class AswinStudentService {
    @Autowired
    private AswinStudentRepo studentRepo;

    public boolean post(AswinStudent student)
    {
        try
        {
            studentRepo.save(student);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<AswinStudent> getAll()
    {
        return studentRepo.findAll();
    }

    public List<AswinStudent> getGreater(int marks)
    {
        return studentRepo.findByMarksGreaterThan(marks);
    }

    public List<AswinStudent> getLesser(int marks)
    {
        return studentRepo.findByMarksLessThan(marks);
    }
    
}
