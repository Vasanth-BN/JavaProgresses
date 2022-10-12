package com.training;

public class FirstTestProgram {

	public static void main(String[] args) {
		Ces obj1=new Manager();
		obj1.seteName("Smrity");
		obj1.seteSalary(1000000);
		obj1.display();
		Ces obj=new Employee1();
		obj.seteName("Mridul");
		obj.seteSalary(99999);
		obj.display();
		Ces obj2=new Employee2();
		obj2.seteName("Vasa");
		obj2.seteSalary(88888);
		obj2.display(); 
	}
}

abstract class Ces{
	private String eName;
	private int eSalary;
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteSalary() {
		return eSalary;
	}
	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}
	abstract void display();
	
}  

class Manager extends Ces{
	public void display() {
		System.out.println(geteName()+"-->"+geteSalary());
	}
}
class Employee1 extends Ces{ 
	@Override
	public void display() {
		System.out.println(geteName()+"-->"+geteSalary());
	}
}
class Employee2 extends Ces{
	@Override
	public void display() {
		System.out.println(geteName()+"-->"+geteSalary());
	}
}
