package credo.training;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input value :");
		try {
		int inp = sc.nextInt();
		findFibonacci(inp);
		sc.close();
		
		}
		catch(InputMismatchException e) {
			System.out.println("Please enter a number");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
	public static void findFibonacci(int inp) {
		System.out.println("\tThe Fibonacci series is");
		int n1 = 0, n2 = 1, n3 = 0;
		for (int i = 1; i <= inp; i++) {
			if (i == 1)
				System.out.print(i - 1 + " ");
			else if (i == 2)
				System.out.print(i - 1 + " ");
			else {
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
				System.out.print(n3 + " ");
			}  

		}
	}
}
