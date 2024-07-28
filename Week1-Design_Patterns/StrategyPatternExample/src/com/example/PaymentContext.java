package com.example;

public class PaymentContext {
	private PaymentStrategy paymentStrategy;

	public PaymentContext(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}

	public void executePaymentStrategy() {
		paymentStrategy.pay();
	}
}
