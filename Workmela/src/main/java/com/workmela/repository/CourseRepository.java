package com.workmela.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workmela.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{
	//Searching by course title
	List<Course> findByCourseTitleContaining(String title);
	Course findById(int id);
}
