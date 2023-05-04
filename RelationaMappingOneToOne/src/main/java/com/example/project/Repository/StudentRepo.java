package com.example.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.project.Model.StudentModel;

public interface StudentRepo extends JpaRepository<StudentModel, Integer> {
	

}
