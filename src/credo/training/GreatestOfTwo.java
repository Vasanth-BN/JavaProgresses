package credo.training;

import java.util.Scanner;

public class GreatestOfTwo {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First value : ");
		int inp1=sc.nextInt();
		System.out.println("Enter Second value : ");
		int inp2=sc.nextInt();
		
		int result= inp1>inp2 ? inp1:inp2;
		System.out.println("The greater value is "+result);
		
		sc.close();
	}
	
}
