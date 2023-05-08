package com.example.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.Model.AdminModel;

public interface AdminRepo extends JpaRepository<AdminModel, String> {

}
