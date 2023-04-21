package com.example.JPA;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class person {

	private int pid;
	private String pname;
	@JsonIgnore
	private String age;
	public person(int pid, String pname, String age) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.age = age;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "person [pid=" + pid + ", pname=" + pname + ", age=" + age + "]";
	}
	
}
