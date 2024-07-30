package com.dsa;

public class Test {
	public static void main(String[] args) {
		EmployeeArray employeeArray = new EmployeeArray(5);

		// Adding employees
		employeeArray.add(new Employee("E001", "Alice", "Manager", 80000));
		employeeArray.add(new Employee("E002", "Bob", "Developer", 60000));
		employeeArray.add(new Employee("E003", "Charlie", "Analyst", 55000));
		employeeArray.add(new Employee("E004", "Diana", "HR", 50000));
		employeeArray.add(new Employee("E005", "Eve", "Intern", 30000));

		// Traversing employees
		employeeArray.traverse();
		System.out.println();

		// Searching for an employee
		Employee foundEmployee = employeeArray.search("E003");
		if (foundEmployee != null) {
			System.out.println("Found: " + foundEmployee);
		} else {
			System.out.println("Employee not found");
		}

		// Deleting an employee
		employeeArray.delete("E002");

		// Traversing employees after deletion
		employeeArray.traverse();

	}

}
