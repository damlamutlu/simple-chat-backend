package com.chatapp.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chatapp.project.models.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer>{

}
