package com.training;

@FunctionalInterface
interface FuncInter1 {
	void operation(int a, int b); // 
}
  
@FunctionalInterface
interface FuncInter2 {
	void sayMessage(String message);
}


public class Test {

	public static void main(String args[]) {
		FuncInter1 add = (x,y) ->System.out.println(x + y);
		add.operation(5, 10);
		FuncInter2 text = message-> System.out.println(message);
		text.sayMessage("Hello world");
	}
}