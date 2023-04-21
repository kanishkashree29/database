package com.example.JPA.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.JPA.Service.bookserv;
import com.example.JPA.model.book;

@RestController
public class bookcontrol {

	@Autowired
	public bookserv bserv;
	@PostMapping("/savebook")
	public book addDetails(@RequestBody book obj1) {
		return bserv.saveInfo(obj1);
	}
}
