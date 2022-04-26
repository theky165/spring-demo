package com.example.springdemo.service;

import com.example.springdemo.entities.Student;
import com.example.springdemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> listAll() {
        return studentRepository.findAll();
    }

    @Override
    public void saveOrUpdateStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student findById(Long id) {
         Optional<Student> studentOptional = studentRepository.findById(id);
         if (!studentOptional.isPresent()) {
             return new Student();
         }
        return studentOptional.get();
    }
}
