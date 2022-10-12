package credo.training;

public class ArithmeticOperators {

	public static void main(String[] args) {
		ArithmeticOpp.multiply(2,3);
	}
	
	

}
class ArithmeticOpp {
	public static void add(int i,int j) {
		System.out.println(i+j);
	}
	public static void subtract(int i,int j) {
		System.out.println(i-j);
	}
	public static void multiply(int i,int j) {
		System.out.println(i*j);
	}
	public static void divide(int i,int j) {
		System.out.println(i/j);
	}
}
