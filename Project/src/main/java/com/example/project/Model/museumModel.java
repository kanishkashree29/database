package com.example.project.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="museum")
public class museumModel {
	@Id
	private int artifact_id;
	private String m_Location;
	private String m_name;
	private String artifact_name;
	private String artifact_category;
	private int no_of_staffs;
	private int display_year;
	private String creator_name;
	private String responsible_emp_name;
	private int accession_number;
	public int getArtifact_id() {
		return artifact_id;
	}
	public void setArtifact_id(int artifact_id) {
		this.artifact_id = artifact_id;
	}
	public String getM_Location() {
		return m_Location;
	}
	public void setM_Location(String m_Location) {
		this.m_Location = m_Location;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getArtifact_name() {
		return artifact_name;
	}
	public void setArtifact_name(String artifact_name) {
		this.artifact_name = artifact_name;
	}
	public String getArtifact_category() {
		return artifact_category;
	}
	public void setArtifact_category(String artifact_category) {
		this.artifact_category = artifact_category;
	}
	public int getNo_of_staffs() {
		return no_of_staffs;
	}
	public void setNo_of_staffs(int no_of_staffs) {
		this.no_of_staffs = no_of_staffs;
	}
	public int getDisplay_year() {
		return display_year;
	}
	public void setDisplay_year(int display_year) {
		this.display_year = display_year;
	}
	public String getCreator_name() {
		return creator_name;
	}
	public void setCreator_name(String creator_name) {
		this.creator_name = creator_name;
	}
	public String getEmp() {
		return responsible_emp_name;
	}
	public void setEmp(String responsible_emp_name) {
		this.responsible_emp_name = responsible_emp_name;
	}
	public int getAccession_number() {
		return accession_number;
	}
	public void setAccession_number(int accession_number) {
		this.accession_number = accession_number;
	}
	
	
	
	


}
