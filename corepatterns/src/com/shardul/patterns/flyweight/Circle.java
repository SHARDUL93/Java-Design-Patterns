package com.shardul.patterns.flyweight;

public class Circle extends Shape {

	private String label;

	public Circle() {
		label = "circle";
	}

	@Override
	public void draw(int radius, String fillColour, String lineColour) {

		System.out.print("Drawing a " + label + " with radius : " + radius);
		System.out.println("\tFillColour =" + fillColour + " Line Colour =" + lineColour);

	}

}
