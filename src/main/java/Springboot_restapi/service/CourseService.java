package Springboot_restapi.service;

import java.util.List;

import Springboot_restapi.entity.Course;

public interface CourseService {
	public String upsert(Course course);
	
	public Course getById(Integer cid);
	
	public List<Course> getAllCourses();
	
	public String deleteById(Integer cid);

	
}
