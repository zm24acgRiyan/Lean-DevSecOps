package com.example.LeanDevSecOps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Removed @RestController and @GetMapping
@SpringBootApplication
public class LeanDevSecOpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeanDevSecOpsApplication.class, args);
	}
	
	// The methods were moved to DemoController.java to improve maintainability.
}