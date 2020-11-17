package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImp implements CourseService 
{

	@Autowired
	private CourseDao courseDao;
	
	List<Course> list;
	
	public CourseServiceImp()
	{
	}
	
	@Override
	public List<Course> getCourses() 
	{
		// TODO Auto-generated method stub
		
		return courseDao.findAll();
	}
	
	@Override
	public Course addCourse(Course course)
	{	
		courseDao.save(course);
		return course;
	}
    
	@Override
	public Course getCourse(long id)
	{
		return courseDao.findById(id).get();
	}

	@Override
	public Course updateCourse(Course course)
	{
		courseDao.save(course);
		return course;
	}
	
	@Override
	public void deleteCourse(long courseId)
	{
		 Course entity=courseDao.getOne(courseId);
		 courseDao.delete(entity);
		 
	}
	
}









