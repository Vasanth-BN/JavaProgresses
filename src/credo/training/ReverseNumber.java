package credo.training;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the number to be reversed :");
			int input=sc.nextInt();
			getReversed(input);
		}
		catch(InputMismatchException e) {
			System.out.println("!!Please enter a number!!");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		sc.close();
		
	}
	public static void getReversed(int inp) {
		int temp=inp,sum=0;
		while(temp>0) {
			sum=(sum*10)+temp%10;
			temp/=10;
		}
		System.out.println("The reversed value is :\n"+sum);
	}

}
