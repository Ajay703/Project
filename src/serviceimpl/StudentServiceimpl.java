package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import com.example.service.StudentService;

@Service
public class StudentServiceimpl implements StudentService{
	@Autowired
	public StudentRepository studentRepository;

    
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	
	public Student updateStudent(Student student, int id) {
		// TODO Auto-generated method stub
		Student _student = studentRepository.findById(id).get();
		_student.setS_Name(student.getS_Name());
	    return studentRepository.save(_student);
	}

	
	public String deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		return "the Student with id " + id + " has been deleted...";
	}

	
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	
	public Student findByStudentId(int studentId) {
		// TODO Auto-generated method stub
		return studentRepository.findById(studentId).get();
	}

	
}
