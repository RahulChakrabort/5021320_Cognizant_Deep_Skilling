package com.example;

import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Customer> l = Arrays.asList(new Customer(86, "Rahul"), new Customer(75, "Preeti"),
				new Customer(87, "Sourav"), new Customer(106, "Tanisha"), new Customer(66, "Anwesha"),
				new Customer(76, "Ayushi"), new Customer(102, "Ayush"));

		CustomerRepository cr = new CustomerRepositoryImpl(l);
		CustomerService cs = new CustomerService(cr);
		System.out.println(cs.findCustomer(106));
	}
}
