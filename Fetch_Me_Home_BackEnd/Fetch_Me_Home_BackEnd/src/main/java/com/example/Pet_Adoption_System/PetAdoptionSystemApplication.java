package com.example.Pet_Adoption_System;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@OpenAPIDefinition(
		info = @Info(
				title="FETCH ME HOME API's",
				version = "1.0.0",
				description="Fetch Me Home API documentation"
		),
		servers = @Server(
				url ="http://localhost:8080/api/",
				description="Fetch Me Home API url"
		)
)
public class PetAdoptionSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetAdoptionSystemApplication.class, args);
	}

}
