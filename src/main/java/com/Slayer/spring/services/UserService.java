package com.Slayer.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Slayer.spring.entities.User;
import com.Slayer.spring.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
		
	}
	public User findById(Integer id) {
	Optional<User> obj = repository.findById(id);
	return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	public void delet(Integer id) {
		repository.deleteById(id);
	}
	public User update(Integer id, User obj) {
		User entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}
	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		
	}
}
