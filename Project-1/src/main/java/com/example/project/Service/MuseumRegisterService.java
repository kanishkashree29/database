package com.example.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.project.Model.MuseumRegisterModel;
import com.example.project.Repo.MuseumRegisterRepo;

@Service
public class MuseumRegisterService {
	@Autowired
	private MuseumRegisterRepo rrepo;
	public MuseumRegisterModel add(MuseumRegisterModel mmodel) {
		return rrepo.save(mmodel);
	}
	
	public List<MuseumRegisterModel> getdata(){
		return rrepo.findAll();
	}
	
	public String checkLogin(String username,String password) {
		MuseumRegisterModel  user=rrepo.findByusername(username);
		if(user==null) {
			return "No User Found";
		}
		else {
			if(user.getPassword().equals(password)) {
				return "Registration Successfull";
			}
			else {
				return "Registration Failed";
			}
		}
	}

}
