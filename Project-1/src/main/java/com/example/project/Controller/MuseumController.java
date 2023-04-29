package com.example.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Model.MuseumModel;
import com.example.project.Repo.MuseumRepo;
import com.example.project.Service.MuseumService;

@RestController
public class MuseumController {
	@Autowired
	public MuseumService mserv;
	@PostMapping("/post1")
	public MuseumModel getDetails(@RequestBody MuseumModel mmodel) {
		return mserv.saveInfo(mmodel);
	}
	@GetMapping("/get1")
	public List<MuseumModel> get() {
		return mserv.getdata();
	}
	@PutMapping("/put")
	public MuseumModel update(@RequestBody MuseumModel mmodel) {
		return mserv.updatedata(mmodel);
	}
	@DeleteMapping("/delete")
	public String deleteDetails(@RequestParam("artifactid") int  artifactid) {
		mserv.deletebyid(artifactid);
		return artifactid+" deleted";
	}
	
	//sort by descending 
	
	@GetMapping("/pageget/{mname}")
	
	public List<MuseumModel> sortmuseum(@PathVariable("mname") String mname){
		return mserv.sortdesc(mname);
	}
	
	@GetMapping("/pageasc/{mname}")
	public List<MuseumModel> sortmuseumasc(@PathVariable ("mname") String mname){
		return mserv.sortasc(mname);
	}
	
	//pagination
	
	@GetMapping("/pagination/{pageno}/{pagesize}")
	
	public List<MuseumModel> page(@PathVariable("pageno") int pageno,@PathVariable("pagesize") int pagesize){
		return mserv.pagination(pageno, pagesize);
	}
	
	//java persistance query language
	@Autowired
	public MuseumRepo ir;
	@GetMapping("/query")
	public List<MuseumModel> getD()
	{
		return ir.getAllData();
	}
 
	@GetMapping("/find/{id}")
	public List<MuseumModel> getData(@PathVariable("id") int pid){
		return ir.byartifactName(pid);
	}
	
	@GetMapping("/getup/{start}/{end}")
	public List<MuseumModel> startendId(@PathVariable("start") int start,@PathVariable("end") int end){
		return ir.startEnd(start, end);
	}
	
	@DeleteMapping("/dell/{id}/{name}")
	public String deleteartifact(@PathVariable("id")int id,@PathVariable("name") String name) {
		ir.deleteId(id, name);
		return "deleted";
	}
	
	
	@PutMapping("/update/{pid}/{pname}")
	public String update(@PathVariable("pid") int pid,@PathVariable("pname") String pname) {
		ir.updatebyquery(pid, pname);
		return "updated";
	}
}
