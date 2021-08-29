package com.doodle.project.services.impl;
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
		messageList.sort((o1,o2) -> o1.getTime().compareTo(o2.getTime()));	
		return messageList;
	}

	@Override
	public Message saveMessage(Message newMessage) {
		Message message = messageRepository.save(newMessage);
		return message;
	}
	
	

}
