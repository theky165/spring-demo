package com.example.springdemo.service;

import com.example.springdemo.entities.Student;

import java.util.List;

public interface StudentService {
    List<Student> listAll();

    void saveOrUpdateStudent(Student student);

    void deleteStudent(Long id);

    Student findById(Long id);
}
