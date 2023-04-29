package com.example.project.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Model.LoginModel;
import com.example.project.Service.LoginService;

@RestController
@RequestMapping("/user")
public class LoginControl {
	@Autowired
	private LoginService lserv;
	@PostMapping("/postmodel")
	public LoginModel savedetails(@RequestBody LoginModel lmodel) {
		return lserv.adddata(lmodel);
	}
	
	@GetMapping("/getdata")
	public List<LoginModel> listall(){
		return lserv.get();
	}
	
	@PostMapping("/check")
	public String log(@RequestBody Map<String,String> logindata)
	{
		String username=logindata.get("username");
		String password=logindata.get("password");
		String result=lserv.checkLogin(username, password);
		return result;
	}
	
	@PostMapping("/forget")
	
	
	public String resetPassword(@RequestBody Map<String,String> resetData)
	{
		String username = resetData.get("username");
		String Password = resetData.get("Password");
		String newPassword = resetData.get("newPassword");
		
		String result = lserv.resetPassword(username, Password, newPassword);
		
		return result;
	}

}
