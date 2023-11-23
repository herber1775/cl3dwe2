package com.cl3villegasdsw;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//http://localhost:8080/swagger-ui/index.html
@SpringBootApplication
@OpenAPIDefinition(info = @Info(
		title = "API",
		description = "CRUD de Personas",
		contact = @Contact(email = "teloidusa@hotmai.com")),
		servers =
		{
			@Server(url = "http://localhost:8080", description = "Develop")
		})

public class cl3villegasdswApplication {

	public static void main(String[] args) {
		SpringApplication.run(cl3villegasdswApplication.class, args);
	}

}
