package com.example.project.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="museam")
public class MuseumModel {
	@Id
	private int artifactid;
	private String location;
	private String mname;
	private String artifactname;
	@Transient
	private String artifactcat;
	private int noofstaffs;
	private int year;
	private String creatorname;
	private String empname;
	private int accessionno;
	public int getArtifactid() {
		return artifactid;
	}
	public void setArtifactid(int artifactid) {
		this.artifactid = artifactid;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getArtifactname() {
		return artifactname;
	}
	public void setArtifactname(String artifactname) {
		this.artifactname = artifactname;
	}
	public String getArtifactcat() {
		return artifactcat;
	}
	public void setArtifactcat(String artifactcat) {
		this.artifactcat = artifactcat;
	}
	public int getNoofstaffs() {
		return noofstaffs;
	}
	public void setNoofstaffs(int noofstaffs) {
		this.noofstaffs = noofstaffs;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCreatorname() {
		return creatorname;
	}
	public void setCreatorname(String creatorname) {
		this.creatorname = creatorname;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getAccessionno() {
		return accessionno;
	}
	public void setAccessionno(int accessionno) {
		this.accessionno = accessionno;
	}
	

}
