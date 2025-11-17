package com.example.LeanDevSecOps;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// This annotation tells Spring Boot how to load the application for the test
@SpringBootTest(classes = LeanDevSecOpsApplication.class)
class LeanDevSecOpsApplicationTests {

	// This is a simple "smoke test" to make sure the application
	// can start up correctly.
	@Test
	void contextLoads() {
	}

}