package com.example.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Model.AdminModel;
import com.example.project.Model.LoanApplicationModel;
import com.example.project.Model.LoginModel;
import com.example.project.Model.UserModel;
import com.example.project.Service.LoanService;

@RestController
@RequestMapping("/loan")
public class LoanController {
	@Autowired
	
	public LoanService lserv;

	//AdminModel
	@PostMapping("/post1")
	public AdminModel postd( @RequestBody AdminModel amodel) {
		return lserv.post1(amodel);
	}
	@GetMapping("/get1")
	public List<AdminModel> getd(){
		return lserv.get1();
	}
	@PutMapping("/put1")
	public AdminModel putd( @RequestBody  AdminModel amodel1) {
		 return lserv.put1(amodel1);
	}
	@DeleteMapping("/delete1/{password}")
	public String deleted(@PathVariable("password") String password) {
		lserv.delete1(password);
		return password+" deleted";
	}
	
	//LoanApplicationModel 
	@PostMapping("/post2")
	public LoanApplicationModel postd1( @RequestBody LoanApplicationModel amodel2) {
		return lserv.post2(amodel2);
	}
	@GetMapping("/get2")
	public List<LoanApplicationModel> getd1(){
		return lserv.get2();
	}
	@PutMapping("/put2")
	public LoanApplicationModel putd1(  @RequestBody LoanApplicationModel amodel3) {
		 return lserv.put2(amodel3);
	}
	@DeleteMapping("/delete2/{loanid}")
	public String deleted1( @PathVariable("loanid") int loanid) {
		lserv.delete2(loanid);
		return loanid+" deleted";
	}
	
	//LoginModel
		@PostMapping("/post3")
		public LoginModel postd2( @RequestBody LoginModel amodel2) {
			return lserv.post3(amodel2);
		}
		@GetMapping("/get3")
		public List<LoginModel> getd2(){
			return lserv.get3();
		}
		@PutMapping("/put3")
		public LoginModel putd2( @RequestBody LoginModel amodel3) {
			 return lserv.put3(amodel3);
		}
		@DeleteMapping("/delete3/{password}")
		public String deleted2( @PathVariable("password") String password) {
			lserv.delete3(password);
			return password+" deleted";
		}
	//UserModel
		
		@PostMapping("/post4")
		public UserModel postd3(  @RequestBody UserModel amodel2) {
			return lserv.post4(amodel2);
		}
		@GetMapping("/get4")
		public List<UserModel> getd3(){
			return lserv.get4();
		}
		@PutMapping("/put4")
		public UserModel putd3(  @RequestBody UserModel amodel3) {
			 return lserv.put4(amodel3);
		}
		@DeleteMapping("/delete4/{id}")
		public String deleted3(@PathVariable("id") int id) {
			lserv.delete4(id);
			return id+" deleted";
		}
		
    

}