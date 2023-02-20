package com.example.service;

import java.util.List;

import com.example.entity.Student;


public interface StudentService {
 Student saveStudent(Student student);
    
    Student findByStudentId(int S_Id);
    
    List<Student> getAllStudents();

	String deleteStudent(int id);
	
	Student updateStudent(Student student, int id);
}
