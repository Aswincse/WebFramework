package com.example.relation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.relation.model.AswinStudent;
import com.example.relation.repository.AswinStudentRepository;

@Service
public class AswinStudentService {
    public AswinStudentRepository studentRepository;
    public AswinStudentService(AswinStudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public AswinStudent saveStudent(AswinStudent student)
    {
        return studentRepository.save(student);
    }
    public List<AswinStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
