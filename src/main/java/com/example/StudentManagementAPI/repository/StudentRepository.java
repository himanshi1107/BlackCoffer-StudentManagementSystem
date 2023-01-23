package com.example.StudentManagementAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentManagementAPI.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
