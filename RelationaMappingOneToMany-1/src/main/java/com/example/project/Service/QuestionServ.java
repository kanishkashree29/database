package com.example.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Model.QuestionModel;
import com.example.project.Repository.QuestionRepo;

@Service
public class QuestionServ {
	@Autowired
	public QuestionRepo qrepo;
	
	public QuestionModel add(QuestionModel qmodel) {
		return qrepo.save(qmodel);
	}
	
	public List<QuestionModel> getdata(){
		return qrepo.findAll();
	}
	
	public QuestionModel put(QuestionModel qmodel) {
		return qrepo.saveAndFlush(qmodel);
	}
	
	public void del(int qno) {
		qrepo.deleteById(qno);
	}

}
