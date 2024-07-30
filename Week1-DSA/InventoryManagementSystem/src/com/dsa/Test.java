package com.dsa;

public class Test {

	public static void main(String[] args) {
		Product product1 = new Product("P001", "Laptop", 50, 799.99);
		Product product2 = new Product("P002", "Smartphone", 200, 499.99);
		Product product3 = new Product("P003", "Tablet", 150, 299.99);
		Product product4 = new Product("P004", "Smartwatch", 100, 199.99);
		Product product5 = new Product("P005", "Headphones", 300, 99.99);

		Inventory inv = new Inventory();
		// adding products
		inv.add(product1);
		inv.add(product2);
		inv.add(product3);
		inv.add(product4);
		inv.add(product5);
		inv.displayAll();
		System.out.println();

		// updating
		inv.update(new Product("P005", "Headphones", 100, 169.99));
		inv.displayAll();
		System.out.println();

		// deleting
		inv.delete("P003");
		inv.displayAll();

	}

}
