package com.aja.rds.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aja.rds.entity.Course_details;
import com.aja.rds.repo.CourseRepo;

@Service
public class CourseService {
	@Autowired
	private CourseRepo courseRepo;

	public Course_details saveDetails(Course_details course_details) {
		Course_details course_details2=courseRepo.save(course_details);
		return course_details2;
	}
	
	public Course_details findById(int id) {
		Optional<Course_details>  optional=courseRepo.findById(id);
		return optional.get();
	}
	
	public List<Course_details> getAllDetails(){
		return courseRepo.findAll();
	}
	
	public Course_details updateDetails(Course_details course_details) {
		Optional<Course_details> optional=courseRepo.findById(course_details.getId());
		if (optional.get() != null) {
			return courseRepo.save(course_details);
		}
		return null;
	}
	public Course_details deleteDetails(int id) {
		Optional<Course_details> optional=courseRepo.findById(id);
		if (optional.get() != null) {
			courseRepo.delete(optional.get());
		}
		return null;
	}
}
 