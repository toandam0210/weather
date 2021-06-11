package com.weather.service.model;

public class WeatherData{
	private int temperature;
	private int humidity;
	private int rainchance;
	private City city;
	
	public WeatherData() {
	}
	public WeatherData(int temperature, int humidity, int rainchance, City city) {
		super();
		this.temperature = temperature;
		this.humidity = humidity;
		this.rainchance = rainchance;
		this.city = city;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public int getRainchance() {
		return rainchance;
	}
	public void setRainchance(int rainchance) {
		this.rainchance = rainchance;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}

	
	
	
	
	
	
}