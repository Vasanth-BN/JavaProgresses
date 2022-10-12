package credo.training;

import java.util.Scanner;

public class GreatestOfThree {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value : ");
		int inp1=sc.nextInt();  
		System.out.println("Enter second value : ");
		int inp2=sc.nextInt();  
		System.out.println("Enter third value : ");
		int inp3=sc.nextInt();  
		int result;
		if(inp1>inp2) {
			if(inp1>inp3) {
				result=inp1;
			}
			else
				result=inp3;
		}
		else
			if(inp2>inp3)
			result=inp2;
			else
				result=inp3;
		System.out.println("The greatest value is : "+result);
		sc.close();
	}
}