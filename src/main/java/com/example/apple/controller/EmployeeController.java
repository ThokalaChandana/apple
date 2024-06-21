package com.example.apple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class EmployeeController {
	@GetMapping("/Employees")
	public String getCountries() {
		return "Employee";
	}
	
	

}
