package com.shardul.patterns.proxy;

import java.util.List;

public class CustomerImpl implements Customer {

	private int id;
	private List<Order> orders;

	CustomerImpl() {
		this.id = 123;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public List<Order> getOrders() {
		return orders;
	}

}
