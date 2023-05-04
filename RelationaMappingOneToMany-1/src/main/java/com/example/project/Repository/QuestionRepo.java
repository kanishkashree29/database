package com.example.project.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.Model.QuestionModel;

public interface QuestionRepo extends JpaRepository<QuestionModel, Integer> {
	
   
}
