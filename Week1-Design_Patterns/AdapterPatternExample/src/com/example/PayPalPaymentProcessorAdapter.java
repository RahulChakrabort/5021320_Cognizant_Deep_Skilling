package com.example;

public class PayPalPaymentProcessorAdapter implements PaymentProcessor {
	private PayPalPaymentProcessor p;

	public PayPalPaymentProcessorAdapter(PayPalPaymentProcessor p) {
		this.p = p;
	}

	@Override
	public void processPayment() {
		p.processPayment();

	}

}
