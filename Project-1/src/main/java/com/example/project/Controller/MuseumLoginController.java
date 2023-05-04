package com.example.project.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Model.MuseumLoginModel;
import com.example.project.Service.MuseumLoginService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/user")
public class MuseumLoginController {
	@Autowired
	private MuseumLoginService mserv;
	
	@Tag(name = "Post LoginMuseum data",description = "Insert Details")
	@PostMapping("/postlogin")
	
	public MuseumLoginModel add(@RequestBody MuseumLoginModel mmodel) {
		return mserv.postdata(mmodel);
	}
	@Tag(name = "Get LoginMuseum data",description = "Get Details")
	@GetMapping("/getlogin")
	
	public List<MuseumLoginModel> getdetails(){
		return mserv.getdata();
	}
	
	@Tag(name = "CheckLOGINMuseum data",description = "checkLogin")
	@PostMapping("/checklogin")
	public String log(@RequestBody Map<String,String> logindata)
	{
		String username=logindata.get("username");
		String password=logindata.get("password");
		String result=mserv.checkLogin(username, password);
		return result;
	}
	
	@Tag(name = "ResetPassword",description = "ForgetPassword")
    @PostMapping("/forget")
	
	
	public String resetPassword(@RequestBody Map<String,String> resetData)
	{
		String username = resetData.get("username");
		String Password = resetData.get("Password");
		String newPassword = resetData.get("newPassword");
		
		String result = mserv.resetPassword(username, Password, newPassword);
		
		return result;
	}

}
