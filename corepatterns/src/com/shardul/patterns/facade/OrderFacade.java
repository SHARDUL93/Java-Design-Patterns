package com.shardul.patterns.facade;

public class OrderFacade {

	public void processorder(String name, int qty) {

		OrderProcessor processor = new OrderProcessor();

		System.out.println("Order details: " + name + ", " + qty);
		if (processor.checkStock(name)) {
			String order = processor.placeOrder(name, qty);
			processor.shipOrder(order);
		}
	}
}
