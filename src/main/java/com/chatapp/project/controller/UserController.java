package com.chatapp.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chatapp.project.models.User;
import com.chatapp.project.services.UserService;

@CrossOrigin
@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping(path="/username/{username}")
	public User findUserByUsername(@PathVariable String username) {
		User user = userService.findUserByUsername(username);
		return user;
	}
	
	@PostMapping(path="saveUser")
	public User saveUser(@RequestBody User newUser) {
		return userService.saveUser(newUser);
	}
	
	@GetMapping(path="/id/{id}")
	public User findUserById(@PathVariable Integer id) {
		User user = userService.findUserById(id);
		return user;
	}
	
}
