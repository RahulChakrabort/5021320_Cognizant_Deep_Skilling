package com.dsa;

public class SearchHouse {

	int linearSearch(Product[] p, int pid) {
		for (int i = 0; i < p.length; i++) {
			if (p[i].getProductId() == pid)
				return i;
		}
		return -1;
	}

	int binarySearch(Product[] p, int size, int pid) {
		int low = 0;
		int high = size - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (pid == p[mid].productId)
				return mid;
			else if (pid < p[mid].productId)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}
}
