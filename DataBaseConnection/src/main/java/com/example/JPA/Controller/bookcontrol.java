package com.example.JPA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/getIPL")
	public List<book> getDetails(){
		return bserv.getInfo();
	}
	//update
	@PutMapping("/putsave")
	public book disp(@RequestBody book b) {
		return bserv.UpdateInfo(b);
	}
	//delete
	@DeleteMapping("/deletebook/{bookno}")
	public String deleteDetails(@PathVariable("bookno") int bookno) {
		bserv.deleteInfo(bookno);
		return "book no "+bookno+" deleted";
	}
	
	 @DeleteMapping("/deletebook1")
	 public String deleteByParam(@RequestParam("bookno") int bookno) {
		 bserv.deleteInfo(bookno);
		 return "book no "+bookno+" is deleted";
	 }
	
}
