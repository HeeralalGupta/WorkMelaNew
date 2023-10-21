package com.workmela.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workmela.model.Recruiter;

public interface RecruiterRepository extends JpaRepository<Recruiter, Integer>{
	Recruiter findByCompanyEmailAndPassword(String email, String password);
	List<Recruiter> findByCompanyEmail(String email);
}
