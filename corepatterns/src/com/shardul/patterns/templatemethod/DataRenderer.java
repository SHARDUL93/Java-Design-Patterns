package com.shardul.patterns.templatemethod;

public abstract class DataRenderer {

	public void render() {

		String data = readData();
		String processedData = processData(data);
		System.out.println("Data : " + processedData);

	}

	public abstract String readData();

	public abstract String processData(String data);

}
