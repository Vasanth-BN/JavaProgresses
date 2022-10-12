package com.training;

import java.util.*;

public class SwapIntegers {
	public static void main(String...ar) {
		Scanner sc=new Scanner(System.in);
		int intg1=sc.nextInt();
		int intg2=sc.nextInt();
		sc.close();
		intg1=intg1+intg2;
		intg2=intg1-intg2;
		intg1=intg1-intg2;
		System.out.println("Swapped output : \n"+intg1+"\n"+intg2);
	}
}
