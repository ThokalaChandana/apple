package com.example.apple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class EmployeeTypeController {
	@GetMapping("/employeetype")
	public String getCountries() {
		return "EmployeeType";
	}
}
