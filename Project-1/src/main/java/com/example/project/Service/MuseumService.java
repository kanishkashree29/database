package com.example.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Model.MuseumModel;

import com.example.project.Repo.MuseumRepo;
@Service
public class MuseumService {
     @Autowired
	 public MuseumRepo obj;
	 public MuseumModel saveInfo(MuseumModel mmodel) {
			return obj.save(mmodel);
		}
	//getdata
		public List<MuseumModel> getdata(){
			return obj.findAll();
			}
		//put data
		public MuseumModel updatedata(MuseumModel mmodel) {
			return obj.saveAndFlush(mmodel);
		}

		//deletedata
		public void deletebyid(int artifact_id) {
			obj.deleteById(artifact_id);
			
		}
}
