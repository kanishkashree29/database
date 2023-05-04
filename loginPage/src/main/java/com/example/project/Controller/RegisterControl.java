package com.example.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Model.MuseumRegister;
import com.example.project.Service.RegisterService;

@RestController
public class RegisterControl {
	@Autowired
	public RegisterService rserv;
	
	@PostMapping("/pos")
	public MuseumRegister savemethod(@RequestBody MuseumRegister  mmodel) {
		return rserv.saveInfo(mmodel);
	}
	

}
