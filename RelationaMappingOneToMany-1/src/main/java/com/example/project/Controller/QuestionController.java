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

import com.example.project.Model.AnswerModel;
import com.example.project.Model.QuestionModel;
import com.example.project.Repository.QuestionRepo;
import com.example.project.Service.QuestionServ;

@RestController
@RequestMapping("/ans")
public class QuestionController {

	@Autowired
	public QuestionServ qserv;
	
	@PostMapping("")
	
	public QuestionModel getdata( @RequestBody QuestionModel qmodel) {
		return qserv.add(qmodel);
	}
	
	@GetMapping("")
	
	public List<QuestionModel> getdata1(){
		return qserv.getdata();
	}
	
	
	@PutMapping("")
	
	public QuestionModel putdata(@RequestBody QuestionModel qmodel) {
		return qserv.put(qmodel);
	}
	
	@DeleteMapping("/{qno}")
	
	public String delete(@PathVariable  int qno) {
		qserv.del(qno);
		return qno+" deleted";
	}
	
	
	
	
	
	
	
	
}
