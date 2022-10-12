package com.training.search;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class LinearSearchTest {

	@Test
	void searchTest() {
		Integer[] arr = { 1, 3, 4, 5, 7 };
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, arr);
		assertEquals(3, LinearSearch.linearSearch(list, 5));

	}

	@Test
	void shouldThrowException() {
		List<Integer> list = new ArrayList<Integer>();
		assertThrows(IndexOutOfBoundsException.class, () -> LinearSearch.linearSearch(list, 6));

	}

	@Test
	void multipleTargetNumInArray() {
		Integer[] arr = { 1, 3, 4, 5, 7, 3, 3, 3 };
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, arr);
		assertEquals(1, LinearSearch.linearSearch(list, 3));
	}
	@Test
	void negativeNumbersTest() {
		Integer[] arr= {-1,2,3,4,-2,-3};
		List<Integer>list=new ArrayList<>();
		Collections.addAll(list, arr);
		assertEquals(4,LinearSearch.linearSearch(list, -2));
	}
}
