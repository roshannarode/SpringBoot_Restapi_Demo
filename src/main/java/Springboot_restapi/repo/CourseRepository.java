package Springboot_restapi.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Springboot_restapi.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Serializable>{
	
	
}
