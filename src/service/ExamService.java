package com.example.service;

import java.util.List;

import com.example.entity.Exam;



public interface ExamService {
   Exam saveExam(Exam exam);
    
   Exam findByExamId(int examId);
    
    List<Exam> getAllExams();

	String deleteExam(int id);
	
	Exam updateExam(Exam exam, int id);
}
