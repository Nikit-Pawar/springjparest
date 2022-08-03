package com.example.springjparest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = {"com.example.springjparest.controllers",
		"com.example.springjparest.repository",
		"com.example.springjparest.service"})
@EntityScan({"com.example.springjparest.model"})
public class SpringjparestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjparestApplication.class, args);
	}

}
