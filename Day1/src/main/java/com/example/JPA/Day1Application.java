package com.example.JPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class Day1Application {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(Day1Application.class, args);
		person obj=new person(1,"Abi","20");
		ObjectMapper o=new ObjectMapper();
		String json=o.writeValueAsString(obj);
		System.out.print(json);
	}

}
