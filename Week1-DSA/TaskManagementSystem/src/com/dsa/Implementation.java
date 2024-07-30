package com.dsa;

import java.util.LinkedList;

public class Implementation {
	private static LinkedList<Task> l;

	public Implementation() {
		this.l = new LinkedList<>();
	}

	static void addTask(Task t) {
		l.add(t);
	}

	static int search(String tid) {
		for (Task t : l) {
			if (t.getTaskId().equals(tid))
				return l.indexOf(t);
		}
		return -1;
	}

	static void travere() {
		for (Task t : l)
			System.out.println(t + " ");
	}

	void delete(String tid) {
		int index = search(tid);
		if (index >= 0) {
			System.out.println("deleted: " + l.get(index));
			l.remove(index);
		} else
			System.out.println("Can not be deleted since does not exist!");
	}

}
