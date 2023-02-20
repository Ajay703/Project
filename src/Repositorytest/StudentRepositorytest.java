package com.example.Repositorytest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import com.example.service.StudentService;


public class StudentRepositorytest {
	@MockBean
	private StudentRepository studentRepository;
	@Autowired
	

	private StudentService studentService;//Test SaveStudent Method
	@Test
	void testSaveExam() 
	{
		Student S = new Student(1,"Shubham Ghadage","MSC(CA)","Web Technology", null);
		Mockito.when(studentRepository.save(S)).thenReturn(S);
		assertEquals(S,studentService.saveStudent(S));
	}

	//Test GetAllStudent Method
	@Test
	void testGetAllExams() 
	{
		List<Student>Student=Stream.of(new Student(1,"Shubham Ghadage","MSC(CA)","Web Technology", null),
			new Student(1,"Shubham Ghadage","MSC(CA)","Web Technology", null))
			.collect(Collectors.toList());
		Mockito.when(studentRepository.findAll()).thenReturn(Student);
		assertEquals(2,studentService.getAllStudents().size());
		
	}

	//Test DeleteStudent Method
	@Test
	void testDeleteExam() 
	{
		studentService.deleteStudent(1);
		Mockito.verify(studentRepository).deleteById(1);
	}

	}


