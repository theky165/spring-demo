package com.example.springdemo.repository;

import com.example.springdemo.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    String findAllByName(String name);
}
