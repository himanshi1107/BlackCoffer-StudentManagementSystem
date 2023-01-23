package com.example.StudentManagementAPI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.StudentManagementAPI.entity.Student;
import com.example.StudentManagementAPI.service.StudentService;

@Controller
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	//Handler methods
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students",studentService.getAllStudents());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudent(Model model) {
		
		Student student = new Student();
		model.addAttribute("student", student);
		return "AddStudent";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudent(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "UpdateStudent";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("student") Student student,Model model) {
		
		Student existStudent = studentService.getStudentById(id);
		existStudent.setId(id);
		existStudent.setFirstName(student.getFirstName());
		existStudent.setLastName(student.getLastName());
		existStudent.setEmail(student.getEmail());
		
		studentService.updateStudent(existStudent);
		return "redirect:/students";
	}
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id){
		
		studentService.deleteStudentbyId(id);
		return "redirect:/students";
	}
	
}
