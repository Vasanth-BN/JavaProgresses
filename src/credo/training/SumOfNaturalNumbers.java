package credo.training;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value :");
		try {
			int input = sc.nextInt();
			findSumOfNaturalNumbers(input);
		} catch (InputMismatchException e) {
			System.out.println("!!Please enter a number!!");
		} catch (Exception e) {
			System.out.println(e);
		}
		sc.close();

	}

	public static void findSumOfNaturalNumbers(int inp) {
		if (inp > 0) {
			int result = 0;
			for (int i = 1; i <= inp; i++) {
				result += i;
			}
			System.out.println("The sum of " + inp + " natural numbers is :\n" + result);
		} else
			System.out.println("Please enter a value greater than 0!");
	}

}
