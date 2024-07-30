package com.dsa;

public class Main {
	public static double finalValue(double p, double r, int n) {
		if (n == 0)
			return p;
		return (1 + r) * finalValue(p, r, n - 1);
	}

	public static void main(String[] args) {
		double presentValue = 1000.0;
		double rate = 0.05;
		int periods = 10;

		double fv = finalValue(presentValue, rate, periods);
		System.out.println("The Final Value is: " + fv);

	}

}
