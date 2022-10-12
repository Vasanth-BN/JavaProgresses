package credo.training;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a number :");
			int input = sc.nextInt();
			if (input >= 0)
				System.out.println("Factorial of " + input + " is :\n" + findFact(input));
			else
				System.out.println("Please enter a valid input!");
		} catch (InputMismatchException e) {
			System.out.println("!!Please enter a number!!");
		} catch (Exception e) {
			System.out.println(e);
		}
		sc.close();
	}

	public static int findFact(int inp) {
		if (inp == 0 || inp == 1) {
			return 1;
		} else {
			return inp * findFact(inp - 1);
		}
	}

}
