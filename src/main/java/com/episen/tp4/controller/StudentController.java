package com.episen.tp4.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    
    @GetMapping("/student/{id}")
    public Student findStudent(@PathVariable int id) {
        return studentRepository.findStudentById(id);
    }

    @PostMapping("/add/student")
    public void addStudent(@RequestBody Student student) {
        studentRepository.saveStudent(student);
    }
    
    @DeleteMapping("/delete/student/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentRepository.deleteStudent(id);
    }
    
    @PutMapping("/update/student/{id}")
    public void updateStudent(@RequestBody Student student) {
        studentRepository.updateStudent(student);
    }

}
