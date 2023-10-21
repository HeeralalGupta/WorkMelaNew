package com.workmela.service;

import java.util.List;

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
	
	public List<Internship> getAllInternship() {
		return internshipRepository.findAll();
	}
}
