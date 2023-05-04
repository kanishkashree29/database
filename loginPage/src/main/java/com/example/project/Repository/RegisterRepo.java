package com.example.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.Model.MuseumRegister;

public interface RegisterRepo extends JpaRepository<MuseumRegister, Integer> {

}
