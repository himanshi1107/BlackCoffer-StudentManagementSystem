package com.example.StudentManagementAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.StudentManagementAPI.entity.Student;
import com.example.StudentManagementAPI.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementApiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApiApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Student student1 = new Student("Himanshi", "Bobde","himanshi@gmail.com");
//		studentRepository.save(student1);
		
	}

}
