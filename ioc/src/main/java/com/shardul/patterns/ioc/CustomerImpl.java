package com.shardul.patterns.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerImpl implements Customer {

//	CreditCard creditCard = new CreditCardImpl(); 		 //hard coded

//	@Autowired
//	private CreditCard creditCard; 						 //field level

	private CreditCard creditCard;

	@Autowired
	public CustomerImpl(CreditCard creditCard) { 		// constructor level
		this.creditCard = creditCard;
	}

	@Override
	public void pay() {
		getCreditCard().makePayment();

	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

//	@Autowired
//	public void setCreditCard(CreditCard creditCard) { 	//setter level
//		this.creditCard = creditCard;
//	}

	public void setCreditCard(CreditCard creditCard) { 
		this.creditCard = creditCard;
	}

}
