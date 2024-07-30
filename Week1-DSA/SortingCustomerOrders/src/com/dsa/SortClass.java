package com.dsa;

public class SortClass {
	void bubbleSort(Order[] a) {
		Order temp;
		for (int i = 0; i < a.length - 1; i++) {
			temp = null;
			boolean bool = true;
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j].getTotalPrice() < a[j + 1].getTotalPrice()) {
					bool = false;
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			if (bool)
				break;
		}
		for (Order o : a)
			System.out.print(o + " ");
	}

	public void quicksort(Order[] a, int low, int high) {
		if (low < high) {
			int pi = partition(a, low, high);
			quicksort(a, low, pi - 1);
			quicksort(a, pi + 1, high);
		}
	}

	public static int partition(Order[] a, int low, int high) {
		Order pivot = a[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (a[j].getTotalPrice() > pivot.getTotalPrice()) {
				i++;
				Order temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}
		i++;
		Order t = pivot;
		a[high] = a[i];
		a[i] = t;
		return i;
	}
}
