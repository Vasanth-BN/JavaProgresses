package com.training.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class SelectionSortTest {
    
	@BeforeClass
	void setUpBeforeClass() {
		
	}
	@Before
	void  setUp() {
		
	}
	
	@Test
	void selectionsortArraytest() {
		int [] a= {2,10,34,100,5};
		int [] exp= {2,5,10,34,100};
		assertArrayEquals(exp,SelectionSort.selectionsort(a));
	}
	
	@Test
	void negativeElementsSortTest() {
		int [] a1= {-34,-5,0,24,-3,-1,200};
		int [] exp= {-34,-5,-3,-1,0,24,200};
		assertArrayEquals(exp,SelectionSort.selectionsort(a1));
	}
	
	@Test
	void EmptyArrayTest() {
		int[] a2= {};
		assertThrows(IndexOutOfBoundsException.class,()->SelectionSort.selectionsort(a2));
	}
	
	@Test
	void repeatedNumberTest() {
		int[] a3= {2,7,3,7,2,9,1,3,9,1};
		int[] exp= {1,1,2,2,3,3,7,7,9,9};
		assertArrayEquals(exp,SelectionSort.selectionsort(a3));
		
	}
	
	
	@After
	void afterMethods() {
		
	}
	
	@AfterClass
	void afterClass() {
		
	}
	
}
