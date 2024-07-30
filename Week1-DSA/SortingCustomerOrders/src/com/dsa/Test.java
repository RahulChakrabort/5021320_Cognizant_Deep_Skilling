package com.dsa;

public class Test {

	public static void main(String[] args) {
		Order[] orders = { new Order("O001", "Alice", 250.75), new Order("O002", "Bob", 175.50),
				new Order("O003", "Charlie", 300.25), new Order("O004", "Diana", 450.00),
				new Order("O005", "Eve", 125.00) };
		SortClass sc = new SortClass();
		// bubble sort
		System.out.println("-----Bubble Sort-----");
		sc.bubbleSort(orders);

		System.out.println();

		// quicksort
		System.out.println("-----Quick Sort-----");
		sc.quicksort(orders, 0, orders.length - 1);
		for (Order o : orders)
			System.out.print(o + " ");

	}

}
