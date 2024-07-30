package com.dsa;

public class Test {

	public static void main(String[] args) {
		Implementation i = new Implementation();
		Task task1 = new Task("T001", "Complete report", "In Progress");
		Task task2 = new Task("T002", "Attend meeting", "Completed");
		Task task3 = new Task("T003", "Update software", "Not Started");

		i.addTask(task1);
		i.addTask(task2);
		i.addTask(task3);
		System.out.println();
		i.travere();

		System.out.println("Task found at: " + i.search("T002"));
		System.out.println();

		i.delete("T002");
		System.out.println();
		i.travere();

	}

}
