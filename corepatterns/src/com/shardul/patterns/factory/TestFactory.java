package com.shardul.patterns.factory;

public class TestFactory {

	public static void main(String[] args) {
		
		PizzaStore ps = new PizzaStore();
		
		System.out.println("TestFactory");
		
		ps.orderPizza("veggie");
		System.out.println();
		ps.orderPizza("chicken");
		

	}

}
