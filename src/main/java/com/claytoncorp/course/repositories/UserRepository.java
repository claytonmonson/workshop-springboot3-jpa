package com.claytoncorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claytoncorp.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
