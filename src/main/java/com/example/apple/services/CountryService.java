package com.example.apple.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apple.model.Country;
import com.example.apple.repositories.CountryRepository;

@Service

public class CountryService {
	@Autowired
	private CountryRepository countryRepository;
	public List<Country> getCountries(){
		return countryRepository.findAll();
		
		
	}
	public void save(Country country) {
		countryRepository.save(country);
	}
	

}
