package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Exam;
import com.example.service.ExamService;



@RestController
public class ExamController {
	@Autowired
	public ExamService examService;
	
	
	// add a Exam
	
	@PostMapping(value = "/exams")
	public Exam addController(@RequestBody Exam exam) {
		return examService.saveExam(exam);
	}

    // get all Exam
	
	@GetMapping(value = "/exams")
	public List<Exam> getAllController() {
		return examService.getAllExams();
	}

	// update a Exam
	
	@PutMapping(value = "/exams/{id}")
	public Exam updateController(@PathVariable int id, @RequestBody Exam exam) {
		return examService.updateExam(exam, id);
	}

	// delete a Exam

	@DeleteMapping(value = "/exams/{id}")
	public String deleteController(@PathVariable int id) {
		return examService.deleteExam(id);
	}

	
	 
}


