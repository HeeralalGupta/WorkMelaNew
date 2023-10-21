package com.workmela.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workmela.model.Job;
import com.workmela.repository.JobRepository;

@Service
public class JobService {
	
	@Autowired
	private JobRepository jobRepository;
	
	public Job uploadJobs(Job job) {
		return jobRepository.save(job);
	}
	
	public List<Job> getAllJobs() {
		return jobRepository.findAll();
	}
}
