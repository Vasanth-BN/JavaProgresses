package com.training.sort;

import java.util.List;

public class BubbleSort {
	
	public static List<Integer> bubblesort(List<Integer> s) {
		if (s.size() <1) {
			throw new IndexOutOfBoundsException("List is empty");
		} 
		
		else {
			int temp, count,a,b;
			boolean flag = true;
			while (flag == true) {
				flag = false;
				count = 0;
				for (int j = 0; j < s.size() - 1; j++) {
					if (s.get(j) > s.get(j + 1)) {
						 a = s.get(j);
						 b = s.get(j + 1);
						temp = a;
						a = b;
						b = temp;
						s.set(j, a);
						s.set(j + 1, b);
						count++;
						flag = true;
					}
				}
				if (count == 0)
					break;
			}
			return s;
		}
	}
}
