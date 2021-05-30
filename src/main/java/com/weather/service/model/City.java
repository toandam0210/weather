package com.weather.service.model;


import javax.persistence.Embeddable;

@Embeddable
public class City{
	private String name;
	private int temperature;
	private int humidity;
	private int rainchance;
	
	public City() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	@Override
	public String toString() {
		return "City [name=" + name + ", temperature=" + temperature + ", humidity=" + humidity + ", rainchance="
				+ rainchance + "]";
	}


	
	
}