package com.dsa;

import java.util.Arrays;
import java.util.Comparator;

public class Test {

	public static void main(String[] args) {
		Product[] products = { new Product(213, "Laptop", "Electronics"), new Product(120, "Smartphone", "Electronics"),
				new Product(356, "Tablet", "Electronics"), new Product(149, "Smartwatch", "Electronics"),
				new Product(321, "Headphones", "Accessories") };
		SearchHouse sh = new SearchHouse();
		int searchPid = 149;
		System.out.println("-----Linear Search-----");
		int ind = sh.linearSearch(products, searchPid);
		if (ind >= 0)
			System.out.println("Product with pid: " + searchPid + " present at index: " + ind);
		else
			System.out.println("Not found with pid: " + searchPid);

		System.out.println();
		System.out.println("-----Binary Search-----");
		Comparator<Product> c = (o1, o2) -> o1.getProductId() - o2.getProductId();
		Arrays.sort(products, c);
		ind = sh.binarySearch(products, products.length, searchPid);
		if (ind >= 0)
			System.out.println("Product with pid: " + searchPid + " present at index: " + ind);
		else
			System.out.println("Not found with pid: " + searchPid);

	}

}
