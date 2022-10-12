package com.training;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
	public static void main(String...arg) {
		List<Integer> list=Arrays.asList(1,3,5,7,8);
		// Lambdas
		
		Consumer<Integer> c=i->System.out.println(i);
		
		list.forEach(c);
		
		//Perfect Lamdas  implementation
		
		list.forEach(i->System.out.print(i+"_"));
		
		
		// Anonymous class
		
		Consumer <Integer> c1=new Consumer<>() {
			public void accept(Integer i) {
				System.out.print(" "+i+" ");
			}
		};
		
		list.forEach(c1);
	}
}
