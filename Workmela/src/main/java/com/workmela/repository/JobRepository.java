package com.workmela.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workmela.model.Job;

public interface JobRepository extends JpaRepository<Job, Integer>{

}
