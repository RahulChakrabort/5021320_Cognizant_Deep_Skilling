package com.example;

public class SingletonImpl {

	public static void main(String[] args) {
		Logger l1 = Logger.getInstance();
		Logger l2 = Logger.getInstance();
		if (l1 == l2)
			System.out.println("Same One Object..");
		else
			System.out.println("Different Objects..");

	}

}
