package com.dsa;

public class SearchImpl {
	int linearSearch(Book[] b, String title) {
		for (int i = 0; i < b.length; i++) {
			if (b[i].getTitle().equals(title))
				return i;
		}
		return -1;
	}

	int binarySearch(Book[] b, int size, String title) {
		int low = 0;
		int high = size - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (title.compareTo(b[mid].getTitle()) == 0)
				return mid;
			else if (title.compareTo(b[mid].getTitle()) < 0)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}
}
