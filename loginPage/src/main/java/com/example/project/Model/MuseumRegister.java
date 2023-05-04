package com.example.project.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MuseumRegister {
	@Id
	private int custid;
	private int phno;
	private int age;
	private String custname;
	private String emailid;
	private String addr;
	private String school;
	private String city;
	private String idproof;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getIdproof() {
		return idproof;
	}
	public void setIdproof(String idproof) {
		this.idproof = idproof;
	}
	
	
	
	
}