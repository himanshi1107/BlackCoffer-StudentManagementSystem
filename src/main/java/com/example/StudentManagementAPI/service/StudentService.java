package com.example.StudentManagementAPI.service;

import java.util.List;

import com.example.StudentManagementAPI.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentbyId(Long id);
}
