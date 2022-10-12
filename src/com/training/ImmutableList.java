package com.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ImmutableList {
	public static void main(String...ar) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<String> l1=new ArrayList<>();
		try {
		for(int i=0;i<n;i++) {
			l1.add(sc.next());
		}
		List<String> l2=new ArrayList<>(l1);
		l2=Collections.unmodifiableList(l2);
		
		l2.add("Hi");
		sc.close();
		}
		catch(Exception e) {
			System.out.println("Immutable list la onnum panna mudiyadhu da thambi");
		}
		finally {
		System.out.println("\n\t Wish u success!");
		}
	}
}
