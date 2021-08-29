package com.doodle.project.services;

import com.doodle.project.models.User;

public interface UserService {
	
	public User findUserByUsername(String username);

	public User saveUser(User newUser);

	public User findUserById(Integer id);

}
