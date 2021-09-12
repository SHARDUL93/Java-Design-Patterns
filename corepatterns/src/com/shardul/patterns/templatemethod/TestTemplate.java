package com.shardul.patterns.templatemethod;

public class TestTemplate {

	public static void main(String[] args) {

		DataRenderer renderer = new XMLDataRenderer();
		renderer.render();
		
		renderer = new CSVDataRenderer();
		renderer.render();
		

	}

}
