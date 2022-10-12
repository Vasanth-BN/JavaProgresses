package credo.training;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeBetweenTwoIntervals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {

			System.out.println("Enter the starting range :");
			int interval1 = sc.nextInt();
			System.out.println("Enter the ending range :");
			int interval2 = sc.nextInt();
			System.out.println("The Prime numbers are :");
			findPrimesBetweenIntervals(interval1, interval2);
		} catch (InputMismatchException e) {
			System.out.println("!!Please enter a number!!");
		} catch (Exception e) {
			System.out.println(e);
		}
		sc.close();

	}

	public static void findPrimesBetweenIntervals(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static boolean isPrime(int inp) {
		int count = 0, len = (int) Math.sqrt(inp);
		for (int i = 2; i <= len; i++) {
			if (inp % i == 0)
				count++;
		}
		boolean result = count == 0 ? true : false;
		return result;
	}

}
