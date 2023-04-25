package com.example.JPA.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JPA.Repository.bookRepo;
import com.example.JPA.model.book;

@Service

public class bookserv {

	@Autowired
	public bookRepo brepo;
	//posting the information
	public book saveInfo(book obj) {
		return brepo.save(obj);
	}
	//getting the information
	public List<book> getInfo(){
		return brepo.findAll();
		}
	//update
	public book UpdateInfo(book ob) {
		return brepo.saveAndFlush(ob);
	}
	//delete
	
	public void deleteInfo(int bookno) {
		brepo.deleteById(bookno);
	}

}
