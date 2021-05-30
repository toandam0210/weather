package com.weather.service.cityservice;


import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.random.RandomDataGenerator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.weather.service.model.City;
@Service
public class CityService{
	@Value("#{'${listCity}'.split(',')}") 
	private List<String> myList;
	public List<City> getAllCity() {	
		RandomDataGenerator randomDataGenerator = new RandomDataGenerator();
		List<City> listAllCity = new ArrayList<>();
		for (int i = 0;i<myList.size();i++) {
			City c = new City();
			c.setName(myList.get(i));
			c.setHumidity(randomDataGenerator.nextInt(0, 100));
			c.setRainchance(randomDataGenerator.nextInt(0,100));
			c.setTemperature(randomDataGenerator.nextInt(-10,10));
			listAllCity.add(c);
		}
		return listAllCity;
	}
	
	
}