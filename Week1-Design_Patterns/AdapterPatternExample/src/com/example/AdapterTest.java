package com.example;

public class AdapterTest {

	public static void main(String[] args) {
		PayPalPaymentProcessor p1 = new PayPalPaymentProcessor();
		PaymentProcessor p = new PayPalPaymentProcessorAdapter(p1);
		p.processPayment();

		CreditCardPaymentProcessor c1 = new CreditCardPaymentProcessor();
		p = new CreditCardPaymentProcessorAdapter(c1);
		p.processPayment();

	}

}
