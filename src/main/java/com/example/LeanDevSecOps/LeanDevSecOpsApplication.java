package com.example.LeanDevSecOps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LeanDevSecOpsApplication { // This class name now matches the file names

	public static void main(String[] args) {
		SpringApplication.run(LeanDevSecOpsApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "Hello, this is the main application!";
	}

	// --- VULNERABLE CODE FOR SAST TESTING ---

	// 1. Hardcoded Password (CWE-798)
	// SonarQube should find this and flag it as a "Security Hotspot".
	private String dbPassword = "Password123_ThisIsVeryBad!";

	// 2. SQL Injection (CWE-89)
	// SonarQube should find this and flag it as a "Vulnerability".
	public void vulnerableSql(String userInput) {
		try {
			// Using java.sql.Statement directly is a classic vulnerability
			java.sql.Connection conn = null; 
			java.sql.Statement stmt = conn.createStatement();
			
			// This is a simple, easy-to-find SQL injection flaw
			String sql = "SELECT * FROM users WHERE username = '" + userInput + "'"; 
			stmt.executeQuery(sql);
		} catch (Exception e) {
			// This catch block is just to make the code compile
		}
	}

	// --- END OF VULNERABLE CODE ---
}