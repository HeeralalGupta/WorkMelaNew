package com.workmela.service;

import java.util.List;

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
	
	public Course getCourseById(int id) {
        Course save = null;
        save = this.courseRepository.findById(id);
        return save;
    }

    public List<Course> getAllCourse() {
        List<Course> save = null;
        save = this.courseRepository.findAll();
        return save;
    }
}
