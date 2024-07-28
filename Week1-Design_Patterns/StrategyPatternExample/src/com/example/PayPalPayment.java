package com.example;

public class PayPalPayment implements PaymentStrategy {

	@Override
	public void pay() {
		System.out.println("Pay through PayPal..");
	}

}
