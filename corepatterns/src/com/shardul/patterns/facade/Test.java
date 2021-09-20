package com.shardul.patterns.facade;

public class Test {

	public static void main(String[] args) {

		OrderFacade facade = new OrderFacade();
		facade.processorder("MacBook", 3);

	}

}
