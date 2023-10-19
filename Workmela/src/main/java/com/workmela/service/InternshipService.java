package com.workmela.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workmela.model.Internship;
import com.workmela.repository.InternshipRepository;

@Service
public class InternshipService {
	
	@Autowired
	private InternshipRepository internshipRepository;
	
	public Internship postInternship(Internship internship) {
		return internshipRepository.save(internship);
	}
}
