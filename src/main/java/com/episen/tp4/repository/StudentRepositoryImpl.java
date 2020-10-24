package com.episen.tp4.repository;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.episen.tp4.model.Student;

@Repository
public class StudentRepositoryImpl implements StudentRepository{
	
	public static ArrayList<Student> list = new ArrayList<>();
	
	@Override
	public Student saveStudent(Student student) {
		student.setId(Student.id);
		list.add(student);
		Student.id = Student.id+1;
		return student;
	}

	@Override
	public ArrayList<Student> findAll() {
		return list;
	}

	@Override
	public boolean deleteStudent(Student student) {
		for (Student student1: list) {
			if(String.valueOf(student.getId()).equals(String.valueOf(student1.getId()))) {
				list.remove(student1);
			    return true;
			}
		}
		return false;	
	}

	@Override
	public boolean updateStudent(Student student) {
		for (Student student1: list) {
			if(String.valueOf(student.getId()).equals(String.valueOf(student1.getId()))) {
				list.remove(student1);
				list.add(student);
			    return true;
			}
		}
		return false;
	}

}
