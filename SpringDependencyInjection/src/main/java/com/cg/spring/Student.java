package com.cg.spring;

public class Student
{
private String  studentName;

	
// using the setter 
	public void setStudentName(String studentName) {
	this.studentName = studentName;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Student [studentName=" + studentName + "]";
	}


	public String getStudentName() {
		return studentName;
	}


	public Student(String studentName) {
		super();
		this.studentName = studentName;
	}


	
}

