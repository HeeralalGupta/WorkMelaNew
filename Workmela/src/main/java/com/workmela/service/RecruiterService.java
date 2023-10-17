package com.workmela.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workmela.model.Recruiter;
import com.workmela.repository.RecruiterRepository;

@Service
public class RecruiterService {
	
	@Autowired
	private RecruiterRepository recruiterRepo;
	
	
	// Recruiter Registration service
	public Recruiter getRecruiterEmail(String email) {
		return recruiterRepo.findByCompanyEmail(email);
	}
	
	public Recruiter saveRecruiter(Recruiter recruiter) {
		return recruiterRepo.save(recruiter);
	}
	
	//Recruiter login service
	
	public Recruiter validateRecruiter(String email, String password) {
		Recruiter find = recruiterRepo.findByCompanyEmailAndPassword(email, password);
		return find;
		}
}
