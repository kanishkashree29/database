package com.example.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Model.MuseumRegister;
import com.example.project.Repository.RegisterRepo;

@Service
public class RegisterService {
	@Autowired
	public RegisterRepo rrepo;
	
	public  MuseumRegister saveInfo(MuseumRegister mmodel) {
		return rrepo.save(mmodel);
	}

}
