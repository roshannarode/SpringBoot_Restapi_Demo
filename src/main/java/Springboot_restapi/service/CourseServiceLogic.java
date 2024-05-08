package Springboot_restapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Springboot_restapi.entity.Course;
import Springboot_restapi.repo.CourseRepository;

@Service
public class CourseServiceLogic implements CourseService {

	
	@Autowired
	private CourseRepository courseRepo;
	@Override
	public String upsert(Course course) {
		courseRepo.save(course);
		return "Sucess";
		
	}

	@Override
	public Course getById(Integer cid) {
		Optional<Course> findById = courseRepo.findById(cid);
		
		if(findById.isPresent()) {
			return findById.get();
		}
		
		return null;
	}
		
	@Override
	public List<Course> getAllCourses() {
		return courseRepo.findAll();
		
	}

	@Override
	public String deleteById(Integer cid) {
		if(courseRepo.existsById(cid)) {
			courseRepo.deleteById(cid);
			return "Delete Sucess";
			
			 
		}else {
			return "No Record Found";		
		}
	}

}
