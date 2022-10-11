package com.Slayer.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Slayer.spring.entities.User;


public interface UserRepository extends JpaRepository<User, Integer> {
	
}
