package com.training;

public class Overload {
	static void show() {
		System.out.println("I'm show");
	}

	static void show(String s) {
		System.out.println("I'm parameterized show " + s);
	}

	public static void main(String[] args) {
		show();
		show("Dude");
	}

}

