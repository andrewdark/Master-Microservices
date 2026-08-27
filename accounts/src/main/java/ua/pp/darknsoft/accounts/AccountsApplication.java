package ua.pp.darknsoft.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "DarkyBank Accounts microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Andrew Dark",
						email = "tutor@darknsoft.pp.ua",
						url = "https://www.darknsoft.pp.ua"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.darknsoft.pp.ua"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "DarkyBank Accounts microservice REST API Documentation",
				url = "https://www.darknsoft.pp.ua/swagger-ui.html"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
