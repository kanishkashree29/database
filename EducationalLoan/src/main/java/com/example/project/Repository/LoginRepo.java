package com.example.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.Model.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel, String> {

}
