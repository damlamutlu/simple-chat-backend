package com.chatapp.project.services;

import java.util.List;

import com.chatapp.project.models.Message;

public interface MessageService {
	
	public List<Message> getAllMessage(); 
	
	public Message saveMessage(Message message);
}
