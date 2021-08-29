package com.doodle.project.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doodle.project.models.User;
import com.doodle.project.repositories.UserRepository;
import com.doodle.project.services.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User findUserByUsername(String username) {
		User user = userRepository.findUserByUsername(username);
		return user;
	}

	@Override
	public User saveUser(User newUser) {
		return userRepository.save(newUser);
	}

	@Override
	public User findUserById(Integer id) {
		return userRepository.findUserById(id);
	}
	
	

}
