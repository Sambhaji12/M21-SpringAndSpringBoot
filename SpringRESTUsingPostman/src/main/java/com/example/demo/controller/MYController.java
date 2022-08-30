package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Course;
import com.example.demo.service.CourseService;



@RestController 
public class MYController
{
	@Autowired 
	private CourseService cs;
	@GetMapping("/home")
	public String home()
	{
		return "this is sambhaji";
	}
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return this.cs.getCourse();
	}
	
	

}
