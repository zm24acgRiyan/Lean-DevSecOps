package com.example.LeanDevSecOps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Spring Boot application annotation
@SpringBootApplication
@RestController
public class LeanDevSecOpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeanDevSecOpsApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "Hello, this is the main application!";
	}
	
	// The vulnerable code has been removed.
	// This code is now clean.
}