package com.example.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Student {
	@Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	   private int S_Id;
	   public Student() {
		super();
	}
	   
	public Student(int s_Id, String s_Name, String s_Class, String s_Subject, List<Exam> examList) {
		super();
		S_Id = s_Id;
		S_Name = s_Name;
		S_Class = s_Class;
		S_Subject = s_Subject;
		this.examList = examList;
	}
	
	public int getS_Id() {
		return S_Id;
	}
	public void setS_Id(int s_Id) {
		S_Id = s_Id;
	}
	public String getS_Name() {
		return S_Name;
	}
	public void setS_Name(String s_Name) {
		S_Name = s_Name;
	}
	public String getS_Class() {
		return S_Class;
	}
	public void setS_Class(String s_Class) {
		S_Class = s_Class;
	}
	public String getS_Subject() {
		return S_Subject;
	}
	public void setS_Subject(String s_Subject) {
		S_Subject = s_Subject;
	}
	public List<Exam> getExamList() {
		return examList;
	}
	public void setExamList(List<Exam> examList) {
		this.examList = examList;
	}
	
	private String S_Name;
	   private String S_Class;
	   private String S_Subject;
	   @OneToMany(fetch = FetchType.EAGER, mappedBy="student",cascade=CascadeType.ALL)
	   @JsonIgnoreProperties("student")
	   private List<Exam> examList = new ArrayList<>();
	 
}
