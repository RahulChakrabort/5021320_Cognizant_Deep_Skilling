package com.example;

public class WebApp implements Observer {

	@Override
	public void update() {
		System.out.println("Web App notified");

	}

}
