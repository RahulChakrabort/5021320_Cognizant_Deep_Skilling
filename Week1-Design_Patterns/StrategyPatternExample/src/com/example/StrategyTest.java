package com.example;

public class StrategyTest {

	public static void main(String[] args) {
		PaymentStrategy s1 = new CreditCardPayment();
		PaymentContext pc = new PaymentContext(s1);
		pc.executePaymentStrategy();

		System.out.println("-------------------");
		s1 = new PayPalPayment();
		pc = new PaymentContext(s1);
		pc.executePaymentStrategy();

	}

}
