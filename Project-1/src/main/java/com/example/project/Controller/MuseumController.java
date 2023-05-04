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

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class MuseumController {
	@Autowired
	public MuseumService mserv;
	@Tag(name = "Post Museum data",description = "Insert Details")
	@PostMapping("/post1")
	public MuseumModel getDetails(@RequestBody MuseumModel mmodel) {
		return mserv.saveInfo(mmodel);
	}
	@Tag(name = "Get Museum data",description = "Retrieve Details")
	@GetMapping("/get1")
	public List<MuseumModel> get() {
		return mserv.getdata();
	}
	@Tag(name = "Update Museum data",description = "Modify Details")
	@PutMapping("/put")
	public MuseumModel update(@RequestBody MuseumModel mmodel) {
		return mserv.updatedata(mmodel);
	}
	@Tag(name = "Delete Museum data",description = "Delete Details")
	@DeleteMapping("/delete")
	public String deleteDetails(@RequestParam("artifactid") int  artifactid) {
		mserv.deletebyid(artifactid);
		return artifactid+" deleted";
	}
	
	//sort by descending 
	@Tag(name = "Sorting by desc",description = "sort by descending")
	@GetMapping("/pageget/{mname}")
	
	public List<MuseumModel> sortmuseum(@PathVariable("mname") String mname){
		return mserv.sortdesc(mname);
	}
	
	@Tag(name = "Sorting by asc",description = "sort by ascending")
	@GetMapping("/pageasc/{mname}")
	public List<MuseumModel> sortmuseumasc(@PathVariable ("mname") String mname){
		return mserv.sortasc(mname);
	}
	
	//pagination
	@Tag(name = "Pagination for Museumdata",description = "larger data into smaller chunks")
	@GetMapping("/pagination/{pageno}/{pagesize}")
	
	public List<MuseumModel> page(@PathVariable("pageno") int pageno,@PathVariable("pagesize") int pagesize){
		return mserv.pagination(pageno, pagesize);
	}
	
	//java persistance query language
	//native queries
	@Autowired
	public MuseumRepo ir;
	@Tag(name = "Native query - Get details",description = "get data")
	@GetMapping("/query")
	public List<MuseumModel> getD()
	{
		return ir.getAllData();
	}
	@Tag(name = "Native query - Get details by Id",description = "find details by specific id")
	@GetMapping("/find/{id}")
	public List<MuseumModel> getData(@PathVariable("id") int pid){
		return ir.byartifactName(pid);
	}
	
	@Tag(name = "Native query - START END",description = "start end method")
	@GetMapping("/getup/{start}/{end}")
	public List<MuseumModel> startendId(@PathVariable("start") int start,@PathVariable("end") int end){
		return ir.startEnd(start, end);
	}
	
	@Tag(name = "Native query - find by ID and NAME",description = "find by id and name")
	
	@DeleteMapping("/dell/{id}/{name}")
	public String deleteartifact(@PathVariable("id")int id,@PathVariable("name") String name) {
		ir.deleteId(id, name);
		return "deleted";
	}
	@Tag(name = "Native query - Update by ID and NAME",description = "update by id and name")
	
	@PutMapping("/update/{pid}/{pname}")
	public String update(@PathVariable("pid") int pid,@PathVariable("pname") String pname) {
		ir.updatebyquery(pid, pname);
		return "updated";
	}
	@Tag(name = "Pagination and Sorting",description = "Pagination and sorting together")
	@GetMapping("/page/{pno}/{psize}/{pname}")
	List<MuseumModel> pagination(@PathVariable("pno") int pno,@PathVariable("psize") int psize,@PathVariable("pname") String pname){
		return mserv.pageandsort(pno, psize, pname);
	}
	
	
	//jpql queries

	@Tag(name = "JPQL Query - GET all Details",description = "Insert Details")
	 @GetMapping("/getAll")
	    public List<MuseumModel> getAllMuseums() {
	        return ir.getAll();
	    }
	@Tag(name = "JPQL Query - GET details by ID",description = "Insert Details")
	 @GetMapping("/getting/{id}")
	 public List<MuseumModel> jpmethod(@PathVariable("id")int id){
		 return ir.jpql(id);
	 }
	
}
