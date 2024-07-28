package com.example;

public class RealImage implements Image {

	@Override
	public void display(String url) {
		System.out.println("Displaying Image from: " + url);
	}

}
