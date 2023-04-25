package com.example.project.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.Model.MuseumModel;

public interface MuseumRepo extends JpaRepository<MuseumModel,Integer> {

}
