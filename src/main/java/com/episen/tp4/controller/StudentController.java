package com.episen.tp4.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.episen.tp4.model.Student;
import com.episen.tp4.repository.StudentRepository;


@RestController
@CrossOrigin
public class StudentController {
	
	@Autowired
    private StudentRepository studentRepository;

    @GetMapping("/student")
    public ArrayList<Student> listStudents() {
        return studentRepository.findAll();
    }

    @PostMapping("/add/student")
    public void addStudent(@RequestBody Student student) {
        studentRepository.saveStudent(student);
    }
    
    @DeleteMapping("/delete/student")
    public void deleteStudent(@RequestBody Student student) {
        studentRepository.deleteStudent(student);
    }
    
    @PutMapping("/update/student/{id}")
    public void updateStudent(@RequestBody Student student) {
        studentRepository.updateStudent(student);
    }

}
