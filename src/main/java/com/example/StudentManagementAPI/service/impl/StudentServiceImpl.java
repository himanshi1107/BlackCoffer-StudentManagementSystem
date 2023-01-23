package com.example.StudentManagementAPI.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.StudentManagementAPI.entity.Student;
import com.example.StudentManagementAPI.repository.StudentRepository;
import com.example.StudentManagementAPI.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(long id) {
		
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentbyId(Long id) {
		
		studentRepository.deleteById(id);
	}

}
