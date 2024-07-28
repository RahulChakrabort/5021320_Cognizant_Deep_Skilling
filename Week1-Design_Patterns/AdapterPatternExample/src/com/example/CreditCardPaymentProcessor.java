package com.example;

public class CreditCardPaymentProcessor implements PaymentProcessor {

	@Override
	public void processPayment() {
		System.out.println("Processing payment through Credit card");

	}

}
