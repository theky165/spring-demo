package com.example.springdemo.entities;

import javax.persistence.*;
//POJO
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //name_ahihi
    private String name;
    private Integer age;
    private Double mark;

    public Student() {
    }

    public Student(Long id, String name, Integer age, Double mark) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }
}
