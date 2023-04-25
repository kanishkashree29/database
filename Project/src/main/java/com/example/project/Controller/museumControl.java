package com.example.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Model.museumModel;
import com.example.project.Service.museumServ;

@RestController
public class museumControl {
	@Autowired
	public museumServ mserv;
	@PostMapping("/post")
	public museumModel getDetails(@RequestBody museumModel mmodel) {
		return mserv.saveInfo(mmodel);
	}
	@GetMapping("/get")
	public List<museumModel> get() {
		return mserv.getdata();
	}
	@PutMapping("/put")
	public museumModel update(@RequestBody museumModel mmodel) {
		return mserv.updatedata(mmodel);
	}
	@DeleteMapping("/deletemuseum")
	public String deleteDetails(@RequestParam("m_name") int  m_name) {
		mserv.deletebyid(m_name);
		return m_name+" deleted";
		
	}

	
}
