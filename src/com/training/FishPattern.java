package com.training;

public class FishPattern{
	public static void main(String...v) {
		int n=5;
		try {
		for(int i=1;i<=n;i++) {
			Thread.sleep(200);
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				Thread.sleep(100);
			}
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*   ");
				Thread.sleep(100);
			}
			
			System.out.println();
		}
		for(int i=n+1;i>=1;i--) {
			Thread.sleep(200);
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				Thread.sleep(100);
			}
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*   ");
				Thread.sleep(100);
			}
			
			System.out.println();
		}
		}
		catch(Exception e) {
			System.out.println("Exception occured"+e.getMessage());
		}
		finally {
			System.out.println("\n\t\t Fish Pattern");
		}
	}
}
