package com.workmela.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workmela.model.User;
import com.workmela.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
    private UserRepository userRepository;
	
	public User findEmail(String email) {
    	return userRepository.findByUserEmail(email);
    }
    // Create a new user
    public User createUser(User user) {
        return userRepository.save(user);
    }
    
    public User getUser(String email, String password) {
		User user = userRepository.findByUserEmailAndPassword(email, password);
		return user;
	}
    
}
