package com.claytoncorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claytoncorp.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}
