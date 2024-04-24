package com.example.bidirection.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.model.AswinStudent;
import com.example.bidirection.model.AswinStudentInfo;
import com.example.bidirection.repository.AswinStudentInfoRepository;
import com.example.bidirection.repository.AswinStudentRepository;

@Service
public class AswinStudentService {
    public AswinStudentRepository studentRepository;
    public AswinStudentInfoRepository studentInfoRepository;
    public AswinStudentService(AswinStudentRepository studentRepository,AswinStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public AswinStudent saveStudent(AswinStudent student)
    {
        return studentRepository.save(student);
    }
    public AswinStudentInfo saveStudentInfo(AswinStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<AswinStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
