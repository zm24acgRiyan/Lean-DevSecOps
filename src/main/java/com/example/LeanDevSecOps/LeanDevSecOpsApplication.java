package com.example.LeanDevSecOps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Suppress a common warning about utility classes
@SpringBootApplication
@RestController
@SuppressWarnings("java:S1118") 
public class LeanDevSecOpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeanDevSecOpsApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "Hello, this is the main application!";
	}
	
	// The vulnerable methods (dbPassword and vulnerableSql) have been removed
	// to remediate the SAST findings detected by SonarQube, 
    // completing the Fix phase of the project cycle.
}