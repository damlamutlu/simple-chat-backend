package com.doodle.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@GetMapping(path="/{username}")
	public User findUserByUSername(@PathVariable String username) {
		return userService.findUserByUsername(username);
	}
	
	@PostMapping(path="saveUser")
	public User saveUser(@RequestBody User newUser) {
		return userService.saveUser(newUser);
	}
}
