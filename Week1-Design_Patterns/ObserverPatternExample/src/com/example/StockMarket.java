package com.example;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {

	private List<Observer> l = new ArrayList<>();

	@Override
	public void register(Observer ob) {
		l.add(ob);
		System.out.println("Observer Registered!");

	}

	@Override
	public void deregister(Observer ob) {
		l.remove(ob);
		System.out.println("Observer Deregistered!");

	}

	@Override
	public void notifyObserver() {
		for (Observer o : l) {
			o.update();
		}

	}

}
