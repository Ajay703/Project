package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Exam;
import com.example.repository.ExamRepository;
import com.example.service.ExamService;
@Service

public class ExamServiceimpl implements ExamService {
	@Autowired
	private ExamRepository examRepository;




	
	public List<Exam> getAllExams() {
		// TODO Auto-generated method stub
		return examRepository.findAll();
	}

	
	public Exam updateExam(Exam exam, int id) {
		
	
	// TODO Auto-generated method stub
		Exam _exam = examRepository.findById(id).get();
	_exam.setE_SubjectName(exam.getE_SubjectName());
	    return examRepository.save(_exam);
	}

	
	public String deleteExam(int id) {
		// TODO Auto-generated method stub
		examRepository.deleteById(id);
		return "the exam with id " + id + " has been deleted...";
	}

	
	public Exam saveExam(Exam exam) {
		// TODO Auto-generated method stub
		return examRepository.save(exam);
	}

	
	public Exam findByExamId(int examId) {
		// TODO Auto-generated method stub
		return examRepository.findById(examId).get();
	}}
