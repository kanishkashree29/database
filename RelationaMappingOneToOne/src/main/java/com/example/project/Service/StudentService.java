package com.example.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Model.StudentModel;
import com.example.project.Repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	public StudentRepo srepo;
	
	public StudentModel addStudent(StudentModel smodel) {
		return srepo.save(smodel);
	}
	
	public List<StudentModel> getStudent(){
		return srepo.findAll();
	}
	
	public StudentModel putdata(StudentModel smodel) {
		return srepo.saveAndFlush(smodel);
	}
	
	public void deletedata(int studentid) {
		srepo.deleteById(studentid);
	}
	
	

}
