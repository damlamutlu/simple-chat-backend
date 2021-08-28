package com.doodle.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doodle.project.models.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer>{

}
