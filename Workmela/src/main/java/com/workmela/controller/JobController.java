package com.workmela.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.workmela.model.Job;
import com.workmela.service.JobService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class JobController {
	
	@Autowired
	private JobService jobService;
	
	@RequestMapping("/saveJobs")
	public String saveJobs(@ModelAttribute Job job, @RequestParam("file") MultipartFile file, HttpServletRequest request) throws IOException {
		byte[] content = file.getBytes();
		String fileType = file.getContentType();
		String fileName = file.getOriginalFilename();
		job.setContent(content);
		job.setFileName(fileName);
		job.setFileType(fileType);
		Job uploadJobs = jobService.uploadJobs(job);
		if(uploadJobs != null) {
			request.getSession().setAttribute("jobSuccess", uploadJobs);
			
		}
		return "redirect:/postJob";
	}

}
