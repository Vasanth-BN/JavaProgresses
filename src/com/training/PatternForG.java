package com.training;

public class PatternForG {

	public static void main(String[] args) {
		int n = 14;
		try {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if ((i == 1 || i == n) || (i <= n / 2 && j == 1) || (i == (n / 2) + 1 && ((j == 1) || (j > n / 2)))
							|| ((i > n / 2 + 1 && i != n) && (j == 1 || j == n))) {
						System.out.print("$ ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}

		} catch (Exception e) {
			System.out.println("Error detected " + e);
		}
	}

}
