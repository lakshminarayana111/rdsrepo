package com.aja.rds.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aja.rds.entity.Course_details;
@Repository
public interface CourseRepo extends JpaRepository<Course_details, Integer> {

}
