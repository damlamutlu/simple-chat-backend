package com.doodle.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doodle.project.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
