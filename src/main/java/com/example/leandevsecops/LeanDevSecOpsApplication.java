package com.example.leandevsecops; // <-- FIXED

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeanDevSecOpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeanDevSecOpsApplication.class, args);
	}
	// Chore: Baseline pass branch for CI validation
}