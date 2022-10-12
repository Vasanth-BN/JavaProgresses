package com.training;


public class OverRiding {
	public static void main(String...arg) {
		OverRiding2 obj=new OverRiding2();
		obj.show();
	}
}
class OverRiding1{
	void show() {
		System.out.println("Override 1");
	}
}

class OverRiding2 extends OverRiding1 {
	@Override
	void show() {
		System.out.println("Override 2");
	}
}