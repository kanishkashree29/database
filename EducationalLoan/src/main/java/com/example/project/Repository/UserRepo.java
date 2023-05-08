package com.example.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.Model.UserModel;
@Repository
public interface UserRepo extends JpaRepository<UserModel, Integer> {

}
