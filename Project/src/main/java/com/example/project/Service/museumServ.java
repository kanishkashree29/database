package com.example.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Model.museumModel;
import com.example.project.Repository.museumRepo;

@Service
public class museumServ {

	@Autowired
	public museumRepo mrepo;
	//postdata
	public museumModel saveInfo(museumModel mmodel) {
		return mrepo.save(mmodel);
	}
	
	//getdata
	public List<museumModel> getdata(){
		return mrepo.findAll();
		}
	
	//put data
	public museumModel updatedata(museumModel mmodel) {
		return mrepo.saveAndFlush(mmodel);
	}
	
	//deletedata
	public void deletebyid(int artifact_id) {
		mrepo.deleteById(artifact_id);
		
	}
	
	
	
}
