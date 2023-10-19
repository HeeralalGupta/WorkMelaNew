package com.workmela.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.workmela.model.Internship;
import com.workmela.service.InternshipService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class InsternshipController {
	
	@Autowired
	private InternshipService internshipService;
	
	@PostMapping("/postInternship")
	public String saveInternshipPost(@ModelAttribute Internship internship, @RequestParam("file") MultipartFile file, HttpServletRequest request) throws IOException {
		byte[] content = file.getBytes();
		String fileType = file.getContentType();
		String fileName = file.getOriginalFilename();
		internship.setContent(content);
		internship.setFileName(fileName);
		internship.setFileType(fileType);
		Internship postInternship = internshipService.postInternship(internship);
		if(postInternship != null) {
			request.getSession().setAttribute("postInternship", postInternship);
		}
		return "redirect:/postInternship";
	}
}
