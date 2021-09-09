package com.chatapp.project.services;

import com.chatapp.project.models.User;

public interface UserService {
	
	public User findUserByUsername(String username);

	public User saveUser(User newUser);

	public User findUserById(Integer id);

}
