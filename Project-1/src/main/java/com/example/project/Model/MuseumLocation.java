package com.example.project.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MuseumLocation {
	@Id
	private int doornumber;
	private String city;
	private String state;
	public int getDoornumber() {
		return doornumber;
	}
	public void setDoornumber(int doornumber) {
		this.doornumber = doornumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

}
