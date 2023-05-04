package com.example.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.project.Model.MuseumLoginModel;
import com.example.project.Repo.MuseumLoginRepo;

@Service
public class MuseumLoginService {
	@Autowired
	private MuseumLoginRepo mrepo;
	
	public MuseumLoginModel postdata(MuseumLoginModel lmodel) {
		return mrepo.save(lmodel);
	}
	
	public List<MuseumLoginModel>  getdata(){
		return mrepo.findAll();
	}
	
	
	public String checkLogin(String username,String password) {
		MuseumLoginModel  user=mrepo.findByusername(username);
		if(user==null) {
			return "No User Found";
		}
		else {
			if(user.getPassword().equals(password)) {
				return "Login Successfull";
			}
			else {
				return "Login Failed";
			}
		}
	}
	
	
	public String resetPassword(String username, String Password, String newPassword)
	{
		MuseumLoginModel  user = mrepo.findByusername(username);
		
		if(user == null)
		{
			return "No user found";
		}
		
		if(!user.getPassword().equals(Password))
		{
			return "Old password is incorrect";
		}
		
		user.setPassword(newPassword);
		mrepo.save(user);
		
		return "Password reset successful";
	}
	
}
	
	
	
	


