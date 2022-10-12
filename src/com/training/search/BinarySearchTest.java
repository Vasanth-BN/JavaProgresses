package com.training.search;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

	@Test
	void binarySearchElementInRighHalfTest() {
		int[] arr= {1,3,5,7,13};
		int key=7;
		assertEquals(3,BinarySearch.binarySearch(arr,arr[0],arr.length-1,key));
	}
	@Test
	void searchElementNotInTheArrayTest() {
		int [] arr= {1,2,4,8,6,3,0};
		int key=12;
		assertEquals(-1,BinarySearch.binarySearch(arr,arr[0],arr.length-1,key));
	}
	@Test
	void binarySearchElementInLeftHalf() {
		int[] arr= {1,2,3,5,6,8};
		int key=2;
		assertEquals(1,BinarySearch.binarySearch(arr,arr[0],arr.length-1,key));
	}

}
