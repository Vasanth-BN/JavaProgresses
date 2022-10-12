package credo.training;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input number :");
		int input = sc.nextInt();
		checkPrime(input);
		sc.close();
	}

	public static void checkPrime(int inp) {
		int count = 0;

		int len = (int) Math.sqrt(inp);
		for (int i = 1; i <= len; i++) {
			if (inp % i == 0)
				count++;
		}
		if (inp <= 0)
			System.out.println("Invalid Input for checking prime");
		else if (inp == 1)
			System.out.println("Neither Prime nor Composite");
		else
			System.out.println(count == 1 ? "It is a Prime number" : "It is not a Prime number");

	}

}
