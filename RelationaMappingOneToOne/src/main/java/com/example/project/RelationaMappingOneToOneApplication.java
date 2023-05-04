package com.example.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
info =@Info(
		title = "MuseumManagement",
	version = "1.1.2",
	description = "Museum Project",
	contact = @Contact(
			name = "Museum",
			email = "kratos@max.io"
			)
	)
)
public class RelationaMappingOneToOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(RelationaMappingOneToOneApplication.class, args);
	}

}
