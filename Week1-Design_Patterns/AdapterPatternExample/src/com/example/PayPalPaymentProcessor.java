package com.example;

public class PayPalPaymentProcessor implements PaymentProcessor {

	@Override
	public void processPayment() {
		System.out.println("Processing payment through PayPal");

	}

}
