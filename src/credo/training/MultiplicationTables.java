package credo.training;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplicationTables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table you want :");
		try {
			int input = sc.nextInt();
			System.out.println("Enter the range of multiples :");
			int range = sc.nextInt();
			findMultiplicationtable(input, range);
		} catch (InputMismatchException e) {
			System.out.println("!!Please enter a number!!");
		} catch (Exception e) {
			System.out.println(e);
		}
		sc.close();

	}

	public static void findMultiplicationtable(int inp, int range) {
		for (int i = 1; i <= range; i++) {
			System.out.println(i + " x " + inp + " = " + i * inp);
		}
	}

}
