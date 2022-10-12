package com.training;
import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

	public static List<Integer> removeDuplicateElements(List<Integer> list) {
		if (list.size() < 1) {
			throw new IndexOutOfBoundsException("Enter valid input");
		} else {
			List<Integer> li = new ArrayList<Integer>();
			for (int i = 0; i < list.size(); i++) {
				if (!li.contains(list.get(i))) {
					li.add(list.get(i));
				}
			}
			
			list=li;
			return list;
		}
	}

}