package credo.training;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input value :");
		try {
		int input=sc.nextInt();
		operateAmstrong( input);
		
		sc.close();}
		catch(InputMismatchException e) {
			System.out.println("Please enter an Integer value");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void operateAmstrong(int input) {
		int sum=0,temp=input,n;
		int len=Integer.toString(input).length();
		while(temp>0) {
			n=temp%10;
			sum+=(int)Math.pow(n, len);
			temp/=10;
		}
		System.out.println( input==sum?"The input is an Amstrong number":"The number is not an Amstrong number");
	}
}
