package credo.training;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PositiveOrNegative {
	public static void main(String... arg) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter your value : ");
			int input = sc.nextInt();
			findPositiveOrNegative(input);
		} catch (InputMismatchException e) {
			System.out.println("!!Please enter a number!!");
		} catch (Exception e) {
			System.out.println(e);
		}

		sc.close();
	}

	public static void findPositiveOrNegative(int inp) {
		if (inp == 0) {
			System.out.println("The Value is Zero");
		} else if (inp < 0) {
			System.out.println("The value is Negative");
		} else
			System.out.println("The value is Positive");
	}
}
