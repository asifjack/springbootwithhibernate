package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Course;

public interface CourseService 
{
	public List<Course> getCourses();
	public Course addCourse(Course course);
	public Course getCourse(long courseId);
	public void deleteCourse(long courseId);
	public Course updateCourse(Course course);
}


