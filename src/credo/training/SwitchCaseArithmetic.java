package credo.training;

import java.util.Scanner;

public class SwitchCaseArithmetic {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value :");
		int inp1=sc.nextInt();
		System.out.println("Enter second value :");
		int inp2=sc.nextInt();
		System.out.println("\tChoose your desired Operation\n1.Add\n2.Subtract\n3.Multiply\n4.Divide");
		int choice=sc.nextInt();
		int result;
		switch(choice) {
		case 1:
			result=inp1+inp2;
			break;
		case 2:
			result=(inp1-inp2);
			break;
		case 3:
			result=(inp1*inp2);
			break;
		case 4:
			result=(inp1/inp2);
			break;
		default:
			result=00;
			break;
		}
		if(Integer.toString(result).equals("00"))
			System.out.println("Invalid Entry");
		else
			System.out.println("The solution is : "+result);
		sc.close();
	}
}
