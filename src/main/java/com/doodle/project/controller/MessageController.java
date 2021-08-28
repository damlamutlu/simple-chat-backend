package com.doodle.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.doodle.project.models.Message;
import com.doodle.project.services.MessageService;

@RestController
public class MessageController {
	
	@Autowired
	MessageService messageService;
	
	@GetMapping(path="/messages")
	public @ResponseBody List<Message> getAllMessages(){
		return messageService.getAllMessage();
				
	}

}