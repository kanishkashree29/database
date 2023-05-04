package com.example.project.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class QuestionModel {
	@Id
	private int qno;
	private String qname;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn
	private List<AnswerModel> ans;
	public int getQno() {
		return qno;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public List<AnswerModel> getAns() {
		return ans;
	}
	public void setAns(List<AnswerModel> ans) {
		this.ans = ans;
	}
	

}
