package com.informatorio.info_market;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Info Market REST API Documentacion",
				description = "Esta es la documetacion REST API. Para el informatorio",
				version = "v1",
				contact = @Contact(
						name = "Informatorio",
						email = "emailprueba@gmail.com"
				),
				license = @License(
						name = "Apache 2.0"
				)
		)
)
public class InfoMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfoMarketApplication.class, args);
	}

}
