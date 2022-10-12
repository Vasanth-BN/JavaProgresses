package com.training;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamsApi {
	public static void main(String...arg) {
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		Predicate<Integer> pred= x-> x>=3;
		int result=list.stream().filter(pred).reduce(0, Integer::sum);
		System.out.println(result);
	}
}
