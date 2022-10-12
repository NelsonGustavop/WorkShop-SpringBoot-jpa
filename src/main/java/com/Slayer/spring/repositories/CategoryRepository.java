package com.Slayer.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Slayer.spring.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
}
