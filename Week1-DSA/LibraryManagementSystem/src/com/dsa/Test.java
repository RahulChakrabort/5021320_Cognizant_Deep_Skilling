package com.dsa;

public class Test {

	public static void main(String[] args) {
		Book[] b = { new Book("B001", "1984", "George Orwell"), new Book("B002", "To Kill a Mockingbird", "Harper Lee"),
				new Book("B003", "The Great Gatsby", "F. Scott Fitzgerald") };
		SearchImpl si = new SearchImpl();
		System.out.println("-----Linear Search-----");
		int s_indsi = si.linearSearch(b, "The Great Gatsby");
		System.out.println("Searched book is found at index: " + s_indsi);
		System.out.println();
		System.out.println("-----Binary Search-----");
		s_indsi = si.binarySearch(b, b.length, "To Kill a Mockingbird");
		System.out.println("Searched book is found at index: " + s_indsi);
	}
}
