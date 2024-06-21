package com.example.apple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class VehicleStatusController {

	@GetMapping("/vehiclestatus")
	public String getCountries() {
		return "Vehicle Status";
	}
}
