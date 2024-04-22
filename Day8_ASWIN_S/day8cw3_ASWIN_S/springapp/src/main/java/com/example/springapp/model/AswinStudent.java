package com.example.springapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AswinStudent {
    @Id
    private int id;
    private String name;
    private int marks;
    public AswinStudent() {
    }
    public AswinStudent(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
}
