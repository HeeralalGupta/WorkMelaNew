package com.workmela.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
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
	public String jobs() {
		return "jobs";
	}
	@RequestMapping("/internship")
	public String intership() {
		return "internship";
	}
	@RequestMapping("/course")
	public String course() {
		return "course";
	}
	@RequestMapping("/courseRegister")
	public String courseRegister() {
		return "courseRegister";
	}
	@RequestMapping("/registerInternship")
	public String internRegister() {
		return "registerInternship";
	}
	@RequestMapping("/applyJobs")
	public String applyJobs() {
		return "applyJobs";
	}
}
