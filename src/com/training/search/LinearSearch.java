package com.training.search;

import java.util.List;

public class LinearSearch {
	public static int linearSearch(List<Integer> list, int search) {
		if (list.size() < 1) {
			throw new IndexOutOfBoundsException("List can't be empty");
		} else {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) == search) {
					return i;
				}
			}

			return -1;
		}
	}
}
