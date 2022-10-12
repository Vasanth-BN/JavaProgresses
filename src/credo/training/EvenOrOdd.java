package credo.training;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter the number :");
			int input = sc.nextInt();
			findEvenOrOdd(input);
		} catch (InputMismatchException e) {
			System.out.println("!!Please enter a number!!");
		} catch (Exception e) {
			System.out.println(e);
		}
		sc.close();
	}

	public static void findEvenOrOdd(int inp) {
		if (inp < 0)
			System.out.println("Invalid input");
		else
			System.out.println(inp % 2 == 0 ? "It is an Even number" : "It is an Odd number");
	}

}
