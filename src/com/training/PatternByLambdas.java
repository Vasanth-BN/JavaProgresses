package com.training;

public class PatternByLambdas {

	public static void main(String[] args) {
		int n=5;
		A obj=()->{
			PatternLib.printIncreasing(n);
			
			PatternLib.printDecreasing(n+1);
		};
		obj.show();
		

	}

}
class PatternLib{
	public static void printIncreasing(int num) {
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void printDecreasing(int num) {
		for(int i=num;i>0;i--) {
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
@FunctionalInterface
interface A{
	void show();
}
interface B{
	void show();
}
