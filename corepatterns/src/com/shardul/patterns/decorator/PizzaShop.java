package com.shardul.patterns.decorator;

public class PizzaShop {

	public static void main(String[] args) {

		System.out.println("new PlainPizza() :");
		Pizza pizza = new PlainPizza();
		pizza.bake();
		
		System.out.println("\nnew CheesePizzaDecorator(new PlainPizza()) :");
		pizza = new CheesePizzaDecorator(new PlainPizza());
		pizza.bake();
		
		System.out.println("\nnew VeggiePizzaDecorator(new CheesePizzaDecorator(new PlainPizza())) :");
		pizza = new VeggiePizzaDecorator(new CheesePizzaDecorator(new PlainPizza()));
		pizza.bake();
		
		
	}

}
