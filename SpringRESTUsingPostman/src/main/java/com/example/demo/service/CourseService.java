package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Course;

public interface CourseService
{
	public abstract List<Course> getCourse();
	public Course getCourse(long id);
}
