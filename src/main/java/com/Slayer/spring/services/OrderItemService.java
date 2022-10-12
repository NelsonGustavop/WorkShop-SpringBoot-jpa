package com.Slayer.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Slayer.spring.entities.OrderItem;
import com.Slayer.spring.repositories.OrderItemRepository;

@Service
public class OrderItemService {
	
	@Autowired
	private OrderItemRepository repository;
	
	public List<OrderItem> findAll(){
		return repository.findAll();
		
	}
	public OrderItem findById(Integer id) {
	Optional<OrderItem> obj = repository.findById(id);
	return obj.get();
	}
}
