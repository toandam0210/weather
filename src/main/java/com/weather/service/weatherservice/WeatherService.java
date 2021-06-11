package com.weather.service.weatherservice;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.random.RandomDataGenerator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.weather.service.model.City;
import com.weather.service.model.WeatherData;

@Service
public class WeatherService {

	@Value("#{'${listCity}'.split(',')}")
	private List<City> myList;

	public List<WeatherData> getAllCity() {
		RandomDataGenerator randomDataGenerator = new RandomDataGenerator();
		List<WeatherData> listAllCity = new ArrayList<>();
		for (int i = 0; i < myList.size(); i++) {
			WeatherData weatherData = new WeatherData();
			weatherData.setCity(myList.get(i));
			weatherData.setHumidity(randomDataGenerator.nextInt(0, 100));
			weatherData.setRainchance(randomDataGenerator.nextInt(0, 100));
			weatherData.setTemperature(randomDataGenerator.nextInt(-10, 10));
			listAllCity.add(weatherData);
		}
		return listAllCity;
	}

}