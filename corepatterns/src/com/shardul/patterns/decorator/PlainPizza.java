package com.shardul.patterns.decorator;

public class PlainPizza implements Pizza {

	@Override
	public void bake() {
		System.out.println("Baking a Plain Pizza");
	}

}
