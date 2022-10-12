package credo.training;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PalindromeOrNot {
	public static void main(String...arg) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input number :");
		try {
		int inp=sc.nextInt();
		checkPalindrome(inp);
		sc.close();}
		catch(InputMismatchException e) {
			System.out.println("Please enter an Integer value as Input");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	public static void checkPalindrome(int inp) {
		int temp=inp,sum=0;;
		while(temp>0) {
			sum=(sum*10)+temp%10;
			temp/=10;
		}
		if(sum==inp) {
			System.out.println("The entered value is a palindrome");
		}
		else
			System.out.println("The entered value is not a Palindrome");
	}

}
