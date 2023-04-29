package com.example.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
		
		//arranging data in descending order
		
		public List<MuseumModel> sortdesc(String mname){
			return obj.findAll(Sort.by(mname).descending());
		}
		
		//arranging data in ascending order
		
		public List<MuseumModel> sortasc(String mname){
			return obj.findAll(Sort.by(mname).ascending());
		}
		
		//pagination
		
		public List<MuseumModel> pagination(int pageno,int pagesize){
			Page<MuseumModel> p =obj.findAll(PageRequest.of(pageno, pagesize));
			return p.getContent();					
		}
}
