package com.workmela.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.workmela.model.Recruiter;
import com.workmela.service.RecruiterService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class RecruiterController {
	
	@Autowired
	private RecruiterService recruiterService;
	
	
	/* Recruiter Registration */
	@PostMapping("/registerRecruiter")
	public String registerHireTalent(@ModelAttribute Recruiter recruiter, HttpServletRequest request) {
		
		Recruiter email = recruiterService.getRecruiterEmail(recruiter.getCompanyEmail());	

		if(email == null){
			recruiterService.saveRecruiter(recruiter);
			request.getSession().setAttribute("registerHTSuccess", "You have registered successfully");
			return "redirect:/loginRecruiter";
		}else{
			request.getSession().setAttribute("validateTalentHireEmail", "Invalid Email");
			return "redirect:/registerRecruiter";
		}
		
	}
	
	/* Recruiter Login */
	
	@PostMapping("/loginRecruiter")
	public String getHTUser(Recruiter recruiter, Model model, HttpServletRequest request) {
		Recruiter validateRecruiter = recruiterService.validateRecruiter(recruiter.getCompanyEmail(), recruiter.getPassword());
				
				if(Objects.nonNull(validateRecruiter)) {
					request.getSession().setAttribute("firstNameHT", validateRecruiter.getFirstname());
					request.getSession().setAttribute("emailHT", validateRecruiter.getCompanyEmail());
					return "redirect:/recruiterDashboard";
					
				}else {
					request.getSession().setAttribute("errorMessageHT", "Invalid Credential");
					return "redirect:/loginRecruiter";
				}
			
			}
			
			@RequestMapping("/logoutHTUser")
			public String logout(HttpServletRequest request) {
				HttpSession session = request.getSession();
				session.removeAttribute("emailHT");
				session.invalidate();
				return "redirect:/loginRecruiter";
				
			}
	
	
}
