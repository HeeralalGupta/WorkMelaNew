package com.workmela.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.workmela.model.Help;
import com.workmela.service.HelpService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelpController {

	@Autowired
	private HelpService helpService;
	
	@RequestMapping("/help")
	public String saveData(@ModelAttribute Help help, HttpServletRequest request) {
		Help saveHelp = helpService.saveHelp(help);
		if(saveHelp!=null) {
			request.getSession().setAttribute("helpSuccess", saveHelp);
		}
		return "redirect:/recruiterHelp";
	}
}
