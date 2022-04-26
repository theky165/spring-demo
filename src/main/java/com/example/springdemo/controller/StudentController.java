package com.example.springdemo.controller;

import com.example.springdemo.entities.Student;
import com.example.springdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/all")
    public String listStudent(ModelMap model) {
        List<Student> studentList = studentService.listAll();
        model.addAttribute("studentList", studentList);
        return "student";
    }

    @GetMapping("/add")
    public String addStudent(ModelMap model) {
        return "addStudent";
    }

    @RequestMapping("/update/{id}")
    public String updateStudent(ModelMap model, @PathVariable(name = "id") Long id) {
        studentService.findById(id);
        Student student = studentService.findById(id);
        model.addAttribute("student", student);
        return "updateStudent";
    }

    @RequestMapping("/save")
    public String saveStudent(ModelMap model, Student student) {
        studentService.saveOrUpdateStudent(student);
        List<Student> studentList = studentService.listAll();
        model.addAttribute("studentList", studentList);
        return "redirect:/student/all";
    }

    @RequestMapping("/detail/{id}")
    public String detailStudent(ModelMap model,@PathVariable(name = "id") Long id) {
        studentService.findById(id);
        Student student = studentService.findById(id);
        model.addAttribute("student", student);
        return "studentDetail";
    }

    @RequestMapping("/delete/{id}")
    public String deleteStudent(ModelMap model,@PathVariable(name = "id") Long id) {
        studentService.deleteStudent(id);
        List<Student> studentList = studentService.listAll();
        model.addAttribute("studentList", studentList);
        return "redirect:/student/all";
    }
}
