package com.example;

public class Test {

	public static void main(String[] args) {
		Observer o1 = new MobileApp();
		Observer o2 = new WebApp();
		Stock s = new StockMarket();
		s.register(o1);
		s.register(o2);
		s.notifyObserver();
	}

}
