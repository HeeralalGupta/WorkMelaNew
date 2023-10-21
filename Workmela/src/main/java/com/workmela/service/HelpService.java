package com.workmela.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workmela.model.Help;
import com.workmela.repository.HelpRepository;

@Service
public class HelpService {
	
	@Autowired
	private HelpRepository helpRepo;
	
	public Help saveHelp(Help help) {
		return helpRepo.save(help);
	}
}
