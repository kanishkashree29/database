package com.example.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.Model.StudentAddress;

public interface AddressRepo extends JpaRepository<StudentAddress, Integer> {

}
