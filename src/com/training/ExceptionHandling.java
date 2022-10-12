package com.training;

class MentorException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -617012600166458235L;
	public MentorException(String a) {
		super(a);
	}
	public MentorException() {
		
	}	
	public MentorException(String a,Throwable c)
	{
		super(a,c);
	}
}
public class ExceptionHandling {
	
	public static void main(String...arg) {
		jump(3);
	}
	public static void jump(int i) {
		if(i<5) {		
			throw new MentorException("vasa",new ArithmeticException());
		}
		System.out.println("popo");
	}
}
