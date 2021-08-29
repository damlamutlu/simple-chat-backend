package com.doodle.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doodle.project.models.User;
import com.doodle.project.services.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping(path="/username/{username}")
	public User findUserByUsername(@PathVariable String username) {
		User user = userService.findUserByUsername(username);
		return user;
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping(path="saveUser")
	public User saveUser(@RequestBody User newUser) {
		return userService.saveUser(newUser);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping(path="/id/{id}")
	public User findUserById(@PathVariable Integer id) {
		User user = userService.findUserById(id);
		return user;
	}
	
}
