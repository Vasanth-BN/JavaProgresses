package com.training.sort;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class BubbleSortTest {

	@Test
	public void sortedEqualsSortedTest() {
		Integer[] arr = { 1, 4, 5, 3, 2 };
		List<Integer> s = new ArrayList<Integer>();
		Collections.addAll(s, arr);
		Collections.sort(s);
		assertEquals(s, BubbleSort.bubblesort(s));
	}

	@Test
	public void IndexExceptionsBubbleSortTest() {
		List<Integer> s = Arrays.asList();
			assertThrows(IndexOutOfBoundsException.class, () -> BubbleSort.bubblesort(s));
	}

	@Test
	public void negativeInputBubbleSortTest() {
		List<Integer> s = Arrays.asList(-1, -2, 3, -5, -234, 234, 45, -6, 18);
		List<Integer> exp=Arrays.asList(-234, -6, -5, -2, -1, 3, 18, 45, 234);
		assertEquals(exp, BubbleSort.bubblesort(s));

	}

	@Test
	public void bubbleSortingDuplicateValuesTest() {
		List<Integer> s = Arrays.asList(1, 4, 4, 5, 5, 3, 2);
		List<Integer> exp = Arrays.asList(1, 2, 3, 4, 4, 5, 5);
		assertEquals(exp, BubbleSort.bubblesort(s));
	}
}

