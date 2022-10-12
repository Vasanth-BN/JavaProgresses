package credo.training;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter the first number :");
			int input1 = sc.nextInt();
			System.out.println("Enter the second number :");
			int input2 = sc.nextInt();
			System.out.println("Values before swapping :" + input1 + "," + input2);

			swapTwoNumbers(input1, input2);
		} catch (InputMismatchException e) {
			System.out.println("!!Please enter a number!!");
		} catch (Exception e) {
			System.out.println(e);
		}
		sc.close();
	}

	public static void swapTwoNumbers(int inp1, int inp2) {
		inp1 = inp1 + inp2;
		inp2 = inp1 - inp2;
		inp1 = inp1 - inp2;
		System.out.println("Values after  swapping :" + inp1 + "," + inp2);
	}

}
