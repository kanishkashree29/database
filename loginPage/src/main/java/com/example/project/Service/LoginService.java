package com.example.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Model.LoginModel;
import com.example.project.Repository.LoginRepo;

@Service
public class LoginService {
	@Autowired
	private LoginRepo lrepo;
	public LoginModel adddata(LoginModel lmodel) {
		return lrepo.save(lmodel);
	}
	
	public List<LoginModel> get(){
		return lrepo.findAll();
	}
	
	public String checkLogin(String username,String password) {
		LoginModel user=lrepo.findByusername(username);
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
		LoginModel user = lrepo.findByusername(username);
		
		if(user == null)
		{
			return "No user found";
		}
		
		if(!user.getPassword().equals(Password))
		{
			return "Old password is incorrect";
		}
		
		user.setPassword(newPassword);
		lrepo.save(user);
		
		return "Password reset successful";
	}

}
