package com.example.leandevsecops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@RestController
public class VulnerableController {

    // 🚨 Hardcoded password (SonarCloud will flag this)
    private static final String DB_PASSWORD = "SuperSecret123!";

    @GetMapping("/insecure")
    public String insecureEndpoint(@RequestParam String username) {
        try {
            Connection conn = DriverManager.getConnection(
                "jdbc:h2:mem:testdb", "sa", DB_PASSWORD);

            Statement stmt = conn.createStatement();

            // 🚨 SQL Injection vulnerability (SonarCloud will flag this)
            String query = "SELECT * FROM users WHERE username = '" + username + "'";
            ResultSet rs = stmt.executeQuery(query);

            return "Executed query: " + query;
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}