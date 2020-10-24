package com.episen.tp4.repository;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.episen.tp4.model.Student;

@Repository
public class StudentRepositoryImpl implements StudentRepository{
	
	public static ArrayList<Student> list = new ArrayList<>();
	public static int id = 1;
	
	@Override
	public Student saveStudent(Student student) {
		student.setId(id);
		list.add(student);
		id++;
		return student;
	}
	
	@Override
	public Student findStudentById(int id) {
		for(Student student:list) {
			if (id == student.getId())
				return student;
		}
		return null;
		
	}

	@Override
	public ArrayList<Student> findAll() {
		return list;
	}

	@Override
	public boolean deleteStudent(int id) {
		for (Student student1: list) {
			if(String.valueOf(id).equals(String.valueOf(student1.getId()))) {
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
