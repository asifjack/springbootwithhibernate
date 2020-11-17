package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController 
{
	@Autowired
	private CourseService courseservice;
	
	@GetMapping("/home")
	public String home()
	{
		return "Welcome to My Home";
	}
	
    //	get All Cources
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return this.courseservice.getCourses();
	}
	
    // Add Course	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course)
	{
		return this.courseservice.addCourse(course);
	}
	
	// Get One Course
	@GetMapping("/courses/{courseId}")
	public Course getCouse(@PathVariable String courseId)
	{
		return this.courseservice.getCourse(Long.parseLong(courseId));
	}
	
	// Update Course 
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course)
	{
		return this.courseservice.updateCourse(course);
	}

    // Delete Course 
	@DeleteMapping("/courses/{courseId}")
	public void deleteCourse(@PathVariable String courseId)
	{
		 this.courseservice.deleteCourse(Long.parseLong(courseId));
	}
}









