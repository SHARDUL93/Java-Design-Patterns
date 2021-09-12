package com.shardul.patterns.adapter;

public class WeatherUI {

	public void showTemperature(int zipcode) {
		
		WeatherAdapter adapter = new WeatherAdapter();
		int findTemperature = adapter.findTemperature(zipcode);
		System.out.println("Show Temperature("+zipcode+") : "+findTemperature);
		
	}
	
}
