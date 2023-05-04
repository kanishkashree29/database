package com.example.project.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.project.Model.MuseumModel;


import jakarta.transaction.Transactional;

public interface MuseumRepo extends JpaRepository<MuseumModel,Integer> 
{
	@Query(value="select * from museam",nativeQuery=true)
	public List<MuseumModel> getAllData();

	@Query(value="select * from museam where artifactid=:id",nativeQuery = true)
	public List<MuseumModel> byartifactName(@Param("id") int id);
	
	@Query(value="select * from museam where artifactid between :start and :end",nativeQuery = true)
	public List<MuseumModel> startEnd(@Param("start") int start,@Param("end") int end);
	
	@Modifying
	@Transactional
	@Query(value="delete from museam where artifactid=? and artifactname=?",nativeQuery = true)
	Integer deleteId(@Param("id") int pid,@Param("name") String pname);
	
	@Modifying
	@Transactional
	@Query(value="update museam set artifactid=:pid where artifactname=:pname",nativeQuery = true)
	public void updatebyquery(@Param("pid") int pid,@Param("pname") String pname);
	
	
	//jpql queries

	
	//@Query("select e from museam e")
	//public List<MuseumModel> getAll();
	
	  @Query("select e from MuseumModel e")
	    List<MuseumModel> getAll();
	  
	  @Query(value="select e from MuseumModel e where e.artifactid=?1")
	  public List<MuseumModel> jpql(@Param("id") int sid);
	  
	  
	  

	
}

