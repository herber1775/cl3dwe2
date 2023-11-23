package com.cl3villegasdsw;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
		title = "API Personas",
		description = "CRUD de Personas", contact = @Contact(email = "devteam@quekiwi.com")),
		servers = {@Server(url = "http://localhost:8081", description = "Local")})

public class cl3villegasdswApplication {

	public static void main(String[] args) {
		SpringApplication.run(cl3villegasdswApplication.class, args);
	}

}
