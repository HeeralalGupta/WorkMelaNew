package com.workmela.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workmela.model.Course;
import com.workmela.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public Course uploadCourse(Course course) {
		return courseRepository.save(course);
	}
}
