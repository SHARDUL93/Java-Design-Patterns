package com.shardul.patterns.adapter;

public class WeatherAdapter {

	public int findTemperature(int zipcode) {
		String city = null;

		if (zipcode == 201010) {
			city = "Ghaziabad";
		}

		WeatherFinder finder = new WeatherFinderImpl();
		int temp = finder.find(city);

		return temp;

	}

}
