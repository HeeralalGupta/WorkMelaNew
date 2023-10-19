package com.workmela.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.workmela.model.Course;
import com.workmela.service.CourseService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@PostMapping("/postCourse")
	public String saveCourse(@ModelAttribute Course course, @RequestParam("file") MultipartFile file, HttpServletRequest request) throws IOException {
		
		byte[] content = file.getBytes();
		String fileName = file.getOriginalFilename();
		String fileType = file.getContentType();
		course.setContent(content);
		course.setFileName(fileName);
		course.setFileType(fileType);
		Course uploadCourse = courseService.uploadCourse(course);
		if(uploadCourse != null) {
			request.getSession().setAttribute("courseSuccess", uploadCourse);
		}
		return "redirect:/postCourse";
	}
}
