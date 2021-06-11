 package com.weather.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather.service.model.WeatherData;
import com.weather.service.weatherservice.WeatherService;

@RestController
@RequestMapping("/api")

public class WeatherController{
	@Autowired 
	private WeatherService cityService;
	
	@GetMapping("/weather")
	public ResponseEntity<List<WeatherData>> getAllCity(){
		return new  ResponseEntity<>(cityService.getAllCity(), HttpStatus.OK);
	}
	
}