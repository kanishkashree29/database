package com.example.project.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Model.MuseumRegisterModel;
import com.example.project.Service.MuseumRegisterService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/register")
public class MuseumRegisterController {
	@Autowired
	
	private MuseumRegisterService rserv;
	@Tag(name = "Post SignupMuseum data",description = "Insert Details")
	@PostMapping("/postregister")
	public MuseumRegisterModel addDetails(@RequestBody  MuseumRegisterModel mmodel) {
		return rserv.add(mmodel);
	}
	@Tag(name = "Get SignupMuseum data",description = "Get Details")
	@GetMapping("/getregister")
	public List<MuseumRegisterModel> get(){
		return rserv.getdata();
	}
	
	@Tag(name = "CheckLogin - SIGNUP PAGE",description = "check Data")
	@PostMapping("/postcheck")
	public String log(@RequestBody Map<String,String> logindata)
	{
		String username=logindata.get("username");
		String password=logindata.get("password");
		String result=rserv.checkLogin(username, password);
		return result;
	}
	
	


}
