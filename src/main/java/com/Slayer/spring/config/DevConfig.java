package com.Slayer.spring.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.Slayer.spring.entities.User;
import com.Slayer.spring.repositories.UserRepository;

@Configuration
@Profile("dev")
public class DevConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Nelson", "NelsonYeger@gmail.com", "123");
		User u2 = new User(null, "Maria", "Maria@gmail.com", "123");
		
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
}
