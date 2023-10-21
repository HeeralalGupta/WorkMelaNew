package com.workmela.controller;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.workmela.model.Course;
import com.workmela.model.Internship;
import com.workmela.model.Job;
import com.workmela.model.User;
import com.workmela.service.CourseService;
import com.workmela.service.InternshipService;
import com.workmela.service.JobService;
import com.workmelahelper.CookiesHelper;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	
	@Autowired
	private CourseService courseService;

	@Autowired
	private JobService jobService;
	
	@Autowired
	private InternshipService internshipService;
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/register")
	public String registerUser() {
		return "register";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping("/dashboard")
	public String dashboard() {
		return "dashboard";
	}
	@RequestMapping("/registerRecruiter")
	public String registerHireTalent() {
		return "registerRecruiter";
	}
	@RequestMapping("/loginRecruiter")
	public String loginHireTalent() {
		return "loginRecruiter";
	}
	@RequestMapping("/recruiterDashboard")
	public String dashboardHireTalent() {
		return "recruiterDashboard";
	}
	
	@RequestMapping("/jobs")
	public String jobs(Model model) {
		List<Job> allJobs = this.jobService.getAllJobs();
		List<Job> list = new ArrayList<>();
		for(Job job : allJobs) {
			byte[] content = job.getContent();
			String base64Image = Base64.getEncoder().encodeToString(content);
			job.setFileName(base64Image);
			list.add(job);
		}
		model.addAttribute("allJobs",list);
		return "jobs";
	}
	
	
	@RequestMapping("/internship")
	public String intership(Model model) {
		List<Internship> allInternship = this.internshipService.getAllInternship();
		List<Internship> list = new ArrayList<>();
		for(Internship internship : allInternship) {
			byte[] content = internship.getContent();
			String base64Image = Base64.getEncoder().encodeToString(content);
			internship.setFileName(base64Image);
			list.add(internship);
		}
		model.addAttribute("allInternship",list);
		return "internship";
	}
	
	@RequestMapping("/course")
	public String course(Model model) {
		List<Course> allCourse = this.courseService.getAllCourse();
		List<Course> list = new ArrayList<>();
		for(Course course : allCourse) {
			byte[] content = course.getContent();
			String base64Image = Base64.getEncoder().encodeToString(content);
			course.setFileName(base64Image);
			list.add(course);
		}
		model.addAttribute("allCourse", list);
		
		return "course";
	}
	
	@RequestMapping("/postInternship")
	public String postInternship(Model model) {
		List<Internship> allInternship = this.internshipService.getAllInternship();
		List<Internship> list = new ArrayList<>();
		for(Internship internship : allInternship) {
			byte[] content = internship.getContent();
			String base64Image = Base64.getEncoder().encodeToString(content);
			internship.setFileName(base64Image);
			list.add(internship);
		}
		model.addAttribute("allInternship",list);
		return "postInternship";
	}
	
	@RequestMapping("/postJob")
	public String postJob(Model model) {
		List<Job> allJobs = this.jobService.getAllJobs();
		List<Job> list = new ArrayList<>();
		for(Job job : allJobs) {
			byte[] content = job.getContent();
			String base64Image = Base64.getEncoder().encodeToString(content);
			job.setFileName(base64Image);
			list.add(job);
		}
		model.addAttribute("allJobs",list);
		return "postJob";
	}
	
	@RequestMapping("/postCourse")
	public String postCourse(Model model) {
		List<Course> allCourse = this.courseService.getAllCourse();
		List<Course> list = new ArrayList<>();
		for(Course course : allCourse) {
			byte[] content = course.getContent();
			String base64Image = Base64.getEncoder().encodeToString(content);
			course.setFileName(base64Image);
			list.add(course);
		}
		model.addAttribute("allCourse", list);
		
		return "postCourse";
	}
	
	@RequestMapping("/recruiterHelp")
	public String recruiterHelp() {
		return "recruiterHelp";
	}
	@RequestMapping("/recruiterProfile")
	public String recruiterProfile() {
		return "recruiterProfile";
	}
	
	@RequestMapping("/user-courses")
	public String userCourses(Model model,HttpServletRequest request) {
		User userCookie = CookiesHelper.getUserCookie("wm_user_session", request);
		model.addAttribute("userCookie",userCookie);
		return "user-courses";
	}

	@GetMapping("/course-register")
	public String courseRegister(){
		return "course-register";
	}
	@GetMapping("/applyJob")
	public String applyJobs(){
		return "applyJob";
	}
	@GetMapping("/applyInternship")
	public String applyInternship(){
		return "applyInternship";
	}
	@GetMapping("/applyCourse")
	public String applyCourse(){
		return "applyCourse";
	}
	

}
