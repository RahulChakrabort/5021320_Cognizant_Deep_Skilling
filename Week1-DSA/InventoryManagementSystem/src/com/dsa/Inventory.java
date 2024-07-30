package com.dsa;

import java.util.HashMap;

public class Inventory {
	HashMap<String, Product> hm = new HashMap<>();

	void displayAll() {
		System.out.println(hm);
	}

	void add(Product p) {
		hm.put(p.getProductId(), p);
		System.out.println("Added: " + p.productId);
	}

	void update(Product p) {
		hm.replace(p.getProductId(), p);
		System.out.println("Updated to: " + p);
	}

	void delete(String key) {
		hm.remove(key);
		System.out.println("Deleted: " + key);
	}

}
