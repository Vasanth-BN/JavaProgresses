package credo.training;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenNumbersBetweenInterval {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the starting number :");
			int interval1 = sc.nextInt();
			System.out.println("Enter the ending number :");
			int interval2 = sc.nextInt();
			System.out.println("The Even numbers between the range are :");
			getEvenNumbersBetweenIntervals(interval1, interval2);
		} catch (InputMismatchException e) {
			System.out.println("!!Please enter a number!!");
		} catch (Exception e) {
			System.out.println(e);
		}
		sc.close();

	}

	public static void getEvenNumbersBetweenIntervals(int start, int end) {
		if (start < 0 || start > end || end < 0) {
			System.out.println("Invalid input\nPlease enter valid range!");
		} else {
			for (int i = start; i <= end; i++) {
				if (i % 2 == 0) {
					System.out.print(i + " ");
				}
			}
		}
	}

}
