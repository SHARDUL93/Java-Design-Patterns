package com.shardul.patterns.proxy;

public class Test {

	public static void main(String[] args) {

		Customer customer = new CustomerImpl();
		System.out.println("CustomerImpl(): ");
		System.out.println("Id: " + customer.getId());
		System.out.println("Orders details: " + customer.getOrders());

		customer = new CustomerProxyImpl();
		System.out.println("CustomerProxyImpl(): ");
		System.out.println("Id: " + customer.getId());
		System.out.println("Orders details: " + customer.getOrders());
		System.out.println("Size: " + customer.getOrders().size());

	}

}
