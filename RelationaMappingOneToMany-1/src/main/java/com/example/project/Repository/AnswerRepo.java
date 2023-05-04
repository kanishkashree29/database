package com.example.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.Model.AnswerModel;

public interface AnswerRepo extends JpaRepository<AnswerModel, Integer> {

}
