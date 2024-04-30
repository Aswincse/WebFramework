package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.AswinStudent;
import com.example.springapp.repository.AswinStudentRepository;

@Service
public class AswinStudentService {
    @Autowired
    AswinStudentRepository studentRepository;
    public AswinStudent addStudents(AswinStudent student)
    {
        return studentRepository.save(student);
    }
    public List<AswinStudent>getStudent()
    {
        return studentRepository.findAll();
    }
    public List<AswinStudent>getStudentInner()
    {
        return studentRepository.getStudentInner();
    }
    public List<AswinStudent>getStudentLeftOuter()
    {
        return studentRepository.getStudentsLeftOuter();
    }
    
}
