package com.training;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ReverseByStackTest {

	@Test
	void reverseStringTest() {
		var sample="Vasanth";
		var exp="htnasaV";
		assertEquals(exp,ReverseByStack.reverseByStack(sample));
		
	}
	@Test
	void reverseOtherDataTypesTest() {
		var sample="12!#4.,";
		var exp=",.4#!21";
		assertEquals(exp,ReverseByStack.reverseByStack(sample));
	}
    @Test
    void stringEmptyTest() {
    	var sample="";
    	assertThrows(Exception.class,()->ReverseByStack.reverseByStack(sample));
    }
}
