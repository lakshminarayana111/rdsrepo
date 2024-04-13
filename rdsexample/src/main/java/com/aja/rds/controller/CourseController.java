package com.aja.rds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aja.rds.entity.Course_details;
import com.aja.rds.service.CourseService;
@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;
@PostMapping("/save")
	public ResponseEntity<Course_details> saveDetails(@RequestBody Course_details course_details) {
		Course_details course_details2 = courseService.saveDetails(course_details);
		return ResponseEntity.status(HttpStatus.CREATED).body(course_details2);
	}
	@GetMapping("/coursedetails/{id}")
	public Course_details findById(@PathVariable int id) {
		return courseService.findById(id);
	}
	@GetMapping("/coursedetails")
	public List<Course_details> getAllDetails(){
		return courseService.getAllDetails();
	}
	@PutMapping("/updatedetails")
	public Course_details updateDetails(@RequestBody Course_details course_details) {
		return courseService.updateDetails(course_details);
	}
	
	public Course_details deleteDetails(@PathVariable int id) {
		return courseService.deleteDetails(id);
	}
}
