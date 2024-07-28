package com.example;

import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {

	private List<Customer> lc;

	public CustomerRepositoryImpl(List<Customer> lc) {
		this.lc = lc;
	}

	@Override
	public Customer findCustomerById(int id) {
		for (Customer c : lc) {
			if (c.getId() == id) {
				return c;
			}
		}
		return null;
	}

}
