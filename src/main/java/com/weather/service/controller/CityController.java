package com.weather.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather.service.cityservice.CityService;
import com.weather.service.model.City;

@RestController
@RequestMapping("/api")

public class CityController{
	@Autowired 
	private CityService cityService;
	
	@GetMapping("/user/weather")
	public ResponseEntity<List<City>> getAllCity(){
		return new  ResponseEntity<>(cityService.getAllCity(), HttpStatus.OK);
	}
	
}