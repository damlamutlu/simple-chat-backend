package com.doodle.project.services;

import java.util.List;

import com.doodle.project.models.Message;

public interface MessageService {
	
	public List<Message> getAllMessage(); 
	
	public Message saveMessage(Message message);
}
