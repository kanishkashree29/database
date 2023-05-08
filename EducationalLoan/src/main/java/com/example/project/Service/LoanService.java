package com.example.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Model.AdminModel;
import com.example.project.Model.LoanApplicationModel;
import com.example.project.Model.LoginModel;
import com.example.project.Model.UserModel;
import com.example.project.Repository.AdminRepo;
import com.example.project.Repository.LoanApplicationRepo;
import com.example.project.Repository.LoginRepo;
import com.example.project.Repository.UserRepo;

@Service
public class LoanService {

	@Autowired
	
	
	
	public AdminRepo arepo;
	
	@Autowired
	public LoanApplicationRepo loanrepo;
	@Autowired
	public LoginRepo lrepo;
	@Autowired
	public UserRepo userrepo;
	
	// AdminModel 
	public AdminModel post1(AdminModel amodel) {
		return arepo.save(amodel);
	}
	
	public List<AdminModel> get1(){
		return arepo.findAll();
	}
	
	public AdminModel put1(AdminModel amodel1) {
		return arepo.saveAndFlush(amodel1);
	}
	
	public void delete1(String password) {
		arepo.deleteById(password);
	}
	
	//LoanApplicationModel
	public LoanApplicationModel post2(LoanApplicationModel amodel2) {
		return loanrepo.save(amodel2);
	}
	
	public List<LoanApplicationModel> get2(){
		return loanrepo.findAll();
	}
	
	public LoanApplicationModel put2(LoanApplicationModel amodel3) {
		return loanrepo.saveAndFlush(amodel3);
	}
	
	public void delete2(int loanid) {
		loanrepo.deleteById(loanid);
	}
	
	//LoginModel
	
	public LoginModel post3(LoginModel amodel4) {
		return lrepo.save(amodel4);
	}
	
	public List<LoginModel> get3(){
		return lrepo.findAll();
	}
	
	public LoginModel put3(LoginModel amodel5) {
		return lrepo.saveAndFlush(amodel5);
	}
	
	public void delete3(String password) {
		lrepo.deleteById(password);
	}
	
	//UserModel
	
	public UserModel post4(UserModel amodel6) {
		return userrepo.save(amodel6);
	}
	
	public List<UserModel> get4(){
		return userrepo.findAll();
	}
	
	public UserModel put4(UserModel amodel7) {
		return userrepo.saveAndFlush(amodel7);
	}
	
	public void delete4(int id) {
		userrepo.deleteById(id);
	}
	
	
	
}