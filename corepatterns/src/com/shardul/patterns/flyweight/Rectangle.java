package com.shardul.patterns.flyweight;

public class Rectangle extends Shape {

	private String label;

	public Rectangle() {
		label = "rectangle";
	}

	@Override
	public void draw(int length, int breadth, String fillStyle) {

		System.out.print("Drawing a " + label + " with LxB : " + length + " " + breadth);
		System.out.println("\tFill Style =" + fillStyle);

	}

}
