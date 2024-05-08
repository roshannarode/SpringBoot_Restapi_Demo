package Springboot_restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Springboot_restapi.entity.Course;
import Springboot_restapi.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseservice;
	
	@PostMapping("/course")
	public ResponseEntity<String> createCourse(@RequestBody Course course){
		String status = courseservice.upsert(course);		
		
		return new ResponseEntity<>(status,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/course/{cid}")
	public ResponseEntity<Course> getCourse (@PathVariable Integer cid){
		Course course = courseservice.getById(cid);
		return new ResponseEntity<>(course, HttpStatus.OK);
	}
	
	@GetMapping("/courses")
	public ResponseEntity<List<Course>> getAllCourse(){
		List<Course> allCourse = courseservice.getAllCourses();
		
		return new ResponseEntity<>(allCourse,HttpStatus.OK);
	}
	
	@PutMapping("/course")
	public ResponseEntity<String> updateCourse(@RequestBody Course course){
		String status = courseservice.upsert(course);		
		
		return new ResponseEntity<>(status,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/course/{cid}")
	public ResponseEntity<String> deleteCourse (@PathVariable Integer cid){
		String status = courseservice.deleteById(cid);
		return new ResponseEntity<>(status , HttpStatus.OK);
	}
	
	
	
	
	
	
}
