package com.example.LeanDevSecOps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// This class now handles the web request, separating concerns.
@RestController
public class DemoController {

	@GetMapping("/")
	public String hello() {
		return "Hello, this is the main application!";
	}
}