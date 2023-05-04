package com.example.project.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.Model.MuseumLoginModel;

public interface MuseumLoginRepo extends JpaRepository<MuseumLoginModel, Integer> {
	MuseumLoginModel findByusername(String username);

}
