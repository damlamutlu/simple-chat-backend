package com.doodle.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.doodle.project.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	@Query(value = "select * from user u where u.username = ?1" , nativeQuery = true)
	public User findUserByUsername(String username);

}
