package com.example.Repositorytest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.entity.Exam;
import com.example.entity.Student;
import com.example.repository.ExamRepository;
import com.example.repository.StudentRepository;
import com.example.service.ExamService;
import com.example.service.StudentService;

public class ExamRepositorytest {
	@MockBean
	private ExamRepository examRepository;
	@Autowired
	

	private ExamService examService;//Test SaveExam Method
	@Test
	void testSaveStudent() 
	{
		Exam E = new Exam(1,"Java",23,12,null);
		Mockito.when(examRepository.save(E)).thenReturn(E);
		assertEquals(E,examService.saveExam(E));
	}

	//Test GetAllExam Method
	@Test
	void testGetAllStudents() 
	{
		List<Exam>Exam=Stream.of(new Exam(1,"Java",23,12,null ),
			new Exam(1,"Java",23,12,null))
			.collect(Collectors.toList());
		Mockito.when(examRepository.findAll()).thenReturn(Exam);
		assertEquals(2,examService.getAllExams().size());
		
	}

	//Test DeleteExam Method
	@Test
	void testDeleteStudent() 
	{
		examService.deleteExam(1);
		Mockito.verify(examRepository).deleteById(1);
	}

	}