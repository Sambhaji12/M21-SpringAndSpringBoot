package com.example.demo;

import org.springframework.stereotype.Component;
// using this annotation we need not to use the beans.xml file 
@Component 
public class Student 
{
	private int uid;
	private String name;
	
	// getter and setter 
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// mathod 
	 public void display()
	 {
		 System.out.println("student class");
	 }
	 
	 public Student()
	 {
		 System.out.println("hello this is the default constuctor:");
	 }
	
	
}
