package com.example.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.Model.museumModel;

public interface museumRepo extends JpaRepository<museumModel, Integer> {

}
