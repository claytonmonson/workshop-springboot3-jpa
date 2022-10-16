package com.claytoncorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claytoncorp.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
