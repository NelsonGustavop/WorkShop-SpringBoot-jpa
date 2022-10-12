package com.Slayer.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Slayer.spring.entities.Products;
import com.Slayer.spring.repositories.ProductsRepository;

@Service
public class ProductsService {
	
	@Autowired
	private ProductsRepository repository;
	
	public List<Products> findAll(){
		return repository.findAll();
		
	}
	public Products findById(Integer id) {
	Optional<Products> obj = repository.findById(id);
	return obj.get();
	}
}
