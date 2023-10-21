package com.workmela.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.workmela.model.User;
import com.workmela.service.UserService;
import com.workmelahelper.CookiesHelper;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/* User Registration */
	@PostMapping("/register")
	public String createUser(@ModelAttribute User user, HttpServletRequest request) {	
		User findEmail = userService.findEmail(user.getUserEmail());	
		if(findEmail != null){
			request.getSession().setAttribute("validateEmail", "Email Aready Exists");
			return "redirect:/register";
		}else{
			userService.createUser(user);
			request.getSession().setAttribute("registerSuccess", "You have registered successfully");
			return "redirect:/login";
		}
	}	
	
	// User login
	
	@Autowired
	private UserService loginService;
		
		@PostMapping("/login")
		public String getUser(@ModelAttribute User user, Model model, HttpServletRequest request, HttpServletResponse response) {
			User login = loginService.getUser(user.getUserEmail(), user.getPassword());
			
			if(Objects.nonNull(login)) {
				model.addAttribute("uName", user.getFirstName());
				request.getSession().setAttribute("firstName", login.getFirstName());
				request.getSession().setAttribute("email", login.getFirstName());
				CookiesHelper.setUserCookies("wm_user_session", login, 60 * 60 * 24, response);
				return "redirect:/dashboard";
				
			}else {
				request.getSession().setAttribute("errorMessage", "Invalid Credential");
				return "redirect:/login";
			}
		
		}
		
		// User Logout
		
		@RequestMapping("/logout")
		public String logout(HttpServletRequest request) {
			HttpSession session = request.getSession();
			session.removeAttribute("email");
			session.invalidate();
			return "redirect:/login";
		}
}
