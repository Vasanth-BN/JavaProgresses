package com.training;

abstract class Talents {
	private String n;
	public String getN() {
		return n;
	}
	public void setN(String n) {
		if(n.length()<5)
		this.n=n;
		else
			this.n="Enter Input lesser than 5 characters";
	}
	abstract void play();
	abstract void dance();
	public void sing() {
		System.out.println("I can sing..."+n);
	}

}
abstract class Skills{
	abstract void java();
	abstract void python();
}
class Student extends Talents{
	public void play() {
		System.out.println("I can play...");
	}
	public void dance() {
		System.out.println("I can Dance...");
//	}
//	@Override
//	public void sing() {
//		System.out.println("Student singing...");
	}
	public void study() {
		System.out.println("Java");
	}
}

public class Abstraction{
	public static void main(String...arg) {
		Student t=new Student();
		t.play();
		t.dance();
		t.study();
		t.setN("Vasa");

		t.sing();
		System.out.println(t.getN());
	}
}
