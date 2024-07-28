package com.example;

public class CreditCardPayment implements PaymentStrategy {

	@Override
	public void pay() {
		System.out.println("Pay through Credit Card..");
	}

}
