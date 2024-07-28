package com.example;

public class CreditCardPaymentProcessorAdapter implements PaymentProcessor {
	private CreditCardPaymentProcessor c;

	public CreditCardPaymentProcessorAdapter(CreditCardPaymentProcessor c) {
		this.c = c;
	}

	@Override
	public void processPayment() {
		c.processPayment();

	}

}
