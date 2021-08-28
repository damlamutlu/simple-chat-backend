package com.doodle.project.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doodle.project.models.Message;
import com.doodle.project.repositories.MessageRepository;
import com.doodle.project.services.MessageService;

@Service
public class MessageServiceImpl implements MessageService{
	@Autowired
	private MessageRepository messageRepository;
	
	@Override
	public List<Message> getAllMessage() {
		
		List<Message>  messageList =  messageRepository.findAll();	
		for(Message message : messageList) {
			System.out.println(message.getMessage());
		}
		
		return messageList;
	}
	
	

}
