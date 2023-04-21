package com.example.JPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.JPA.model.book;

public interface bookRepo extends JpaRepository<book, Integer> {
	

}
