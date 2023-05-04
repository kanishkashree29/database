package com.example.project.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.Model.MuseumRegisterModel;

public interface MuseumRegisterRepo extends JpaRepository<MuseumRegisterModel, Integer> {

	public MuseumRegisterModel findByusername(String username);
}
