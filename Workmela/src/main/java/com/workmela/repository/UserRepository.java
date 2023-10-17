package com.workmela.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workmela.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	User findByUserEmailAndPassword(String email, String password);
	User findByUserEmail(String email);
}
