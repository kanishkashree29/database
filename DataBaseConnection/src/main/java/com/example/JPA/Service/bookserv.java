package com.example.JPA.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JPA.Repository.bookRepo;
import com.example.JPA.model.book;

@Service

public class bookserv {

	@Autowired
	public bookRepo brepo;
	public book saveInfo(book obj) {
		return brepo.save(obj);
	}

}
