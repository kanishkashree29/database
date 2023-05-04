package com.example.project.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AnswerModel {
	@Id
	private int ano;
	private String ans;
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	

}
