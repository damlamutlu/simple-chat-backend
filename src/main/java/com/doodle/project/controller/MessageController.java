package com.doodle.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.doodle.project.models.Message;
import com.doodle.project.services.MessageService;

@RestController
public class MessageController {
	
	@Autowired
	MessageService messageService;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping(path="/messages")
	public @ResponseBody List<Message> getAllMessages(){
		return messageService.getAllMessage();
				
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping(path="/saveMessage")
	public Message saveMessage(@RequestBody Message newMessage) {
		return messageService.saveMessage(newMessage);
	}

}
