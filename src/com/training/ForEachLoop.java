package com.training;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEachLoop {
	public static void main(String...arg) {
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		
		// enhanced for loops
		for(int i : list) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//Iterators
		Iterator<Integer> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+5+" ");
		}
		System.out.println();
		//forEach with Lambda
		
		list.forEach(i->{
			i*=2;
			System.out.print(i+" ");
		});
	}
}