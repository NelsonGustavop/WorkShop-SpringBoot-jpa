package com.Slayer.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Slayer.spring.entities.Products;

public interface ProductsRepository extends JpaRepository<Products, Integer> {

}
