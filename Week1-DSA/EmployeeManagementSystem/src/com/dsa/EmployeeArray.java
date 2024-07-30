package com.dsa;

import java.util.Arrays;

public class EmployeeArray {
	private Employee[] e;
	int size;

	public EmployeeArray(int capacity) {
		this.e = new Employee[capacity];
		size = 0;
	}

	public void add(Employee emp) {
		if (size >= e.length)
			e = Arrays.copyOf(e, e.length * 2);
		e[size++] = emp;
		System.out.println("Added: " + emp);
	}

	public Employee search(String eid) {
		for (Employee emp : e) {
			if (emp.getEmployeeId().equals(eid))
				return emp;
		}
		return null;
	}

	public void traverse() {
		for (Employee emp : e)
			System.out.print(emp + " ");
	}

	public void delete(String eid) {
		for (int i = 0; i < e.length; i++) {
			if (e[i].getEmployeeId().equals(eid)) {
				System.out.println("deleted: " + e[i]);
				e[i] = e[size - 1];
				size--;
				break;
			}
		}
	}

}
