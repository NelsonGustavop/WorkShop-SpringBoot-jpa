package com.Slayer.spring.resource;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Slayer.spring.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1, "Nelson", "Nelson@gmail.com","123" );
		return  ResponseEntity.ok().body(u);
		
	}
}
