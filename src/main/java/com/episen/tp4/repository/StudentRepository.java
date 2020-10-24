package com.episen.tp4.repository;

import java.util.ArrayList;

import com.episen.tp4.model.Student;


public interface StudentRepository {

    public Student saveStudent(Student student);
    public ArrayList<Student> findAll();
    public boolean deleteStudent(int id);
    public boolean updateStudent(Student student);
	Student findStudentById(int id);
}


