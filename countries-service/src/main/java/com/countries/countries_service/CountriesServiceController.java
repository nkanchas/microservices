package com.countries.countries_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountriesServiceController {
	
	@GetMapping
	public String getCountry() {
		return " served from countries-service:8282";
	}

}
