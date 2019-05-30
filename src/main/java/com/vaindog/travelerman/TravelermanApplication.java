package com.vaindog.travelerman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.config.EnableIntegration;

@EnableIntegration
@IntegrationComponentScan
@ComponentScan({"com.vaindog.travelerman.document", 
	 			"com.vaindog.travelerman.service",
	 			"com.vaindog.travelerman.controller",
	 			"com.vaindog.travelerman.config",
	 			"com.vaindog.travelerman.exception"})
@EnableMongoRepositories (basePackages = "com.vaindog.travelerman.repository")
@SpringBootApplication (exclude = { SecurityAutoConfiguration.class, ManagementWebSecurityAutoConfiguration.class })
public class TravelermanApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelermanApplication.class, args);
	}

}
