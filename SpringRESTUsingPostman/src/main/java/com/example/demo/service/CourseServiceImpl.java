package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Course;
@Service
public class CourseServiceImpl implements CourseService 
{
	List<Course> list;
	public CourseServiceImpl()
	{
		list =new ArrayList<>();
		list.add(new Course (145 ,"java core course","this course content the basci of java "));
		list.add(new Course (133,"python ","mostly used language:"));
	}
	@Override
	public List<Course> getCourse() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Course getCourse(long id) {
		
		
		return null;
	}

}
