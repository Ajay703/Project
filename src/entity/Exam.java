package com.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Exam {
	

	 public Exam() {
		
	}
	 
	public Exam(@NotEmpty int e_Id, String e_SubjectName, int e_ExamDate, int e_ExamTime, Student student) {
		super();
		E_Id = e_Id;
		E_SubjectName = e_SubjectName;
		E_ExamDate = e_ExamDate;
		E_ExamTime = e_ExamTime;
		this.student = student;
	}
	
	public int getE_Id() {
		return E_Id;
	}
	public void setE_Id(int e_Id) {
		E_Id = e_Id;
	}
	public String getE_SubjectName() {
		return E_SubjectName;
	}
	public void setE_SubjectName(String e_SubjectName) {
		E_SubjectName = e_SubjectName;
	}
	public int getE_ExamDate() {
		return E_ExamDate;
	}
	public void setE_ExamDate(int e_ExamDate) {
		E_ExamDate = e_ExamDate;
	}
	public int getE_ExamTime() {
		return E_ExamTime;
	}
	public void setE_ExamTime(int e_ExamTime) {
		E_ExamTime = e_ExamTime;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)

	 private int E_Id;
	@NotNull(message = "Name is Not Null")
	@NotBlank(message="name is not blank")

	  private String E_SubjectName;
	  private int E_ExamDate;
	  private int E_ExamTime;
	  @ManyToOne(cascade=CascadeType.ALL, fetch= FetchType.EAGER)
	  @JoinColumn(name="S_Id")
	  private Student student;
}
