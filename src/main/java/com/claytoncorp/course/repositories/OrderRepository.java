package com.claytoncorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claytoncorp.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
