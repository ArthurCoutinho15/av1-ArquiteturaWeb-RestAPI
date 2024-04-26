package com.example.AV1_API.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {"com.example"})
@EnableMongoRepositories("com.example.AV1_API.repository")
public class Av1ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Av1ApiApplication.class, args);
	}

}
