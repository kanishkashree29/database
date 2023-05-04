package com.example.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Model.StudentModel;
import com.example.project.Service.StudentService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class StudentController {

	@Autowired
	public StudentService sserv;
	@Tag(name = "Post student data",description = "Insert Details")
	@PostMapping("/poststudent")
	
	public StudentModel add(@RequestBody  StudentModel smodel) {
		return sserv.addStudent(smodel);
	}
	@Tag(name = "Get student data",description = "Retrieve Details")
	
	@GetMapping("/getstudent")
	
	public List<StudentModel> get(){
		return sserv.getStudent();
	}
	
	@Tag(name = "Update student data",description = "Update Details")
	@PutMapping("/putstudent")
	
	public StudentModel put( @RequestBody  StudentModel smodel) {
		return sserv.putdata(smodel);
	}
	
	@Tag(name = "delete student data",description = "delete Details")
	@DeleteMapping("/deletestudent/{id}")
	
	public String delete( @PathVariable("id") int studentid) {
		 sserv.deletedata(studentid);
		 return studentid+" deleted";
	}
	
}
