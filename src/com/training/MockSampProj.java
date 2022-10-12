package com.training;

import java.util.Scanner;

public class MockSampProj {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Manager1 obj = new Manager1();
		obj.setSalary(1000000);
		obj.print();
		Employee obj1 = new Employee();
		obj1.setSalary(99999);
		obj1.print();
		obj1.print(88888);
		sc.close();
	}
}
interface Salary {
	void print();
	
}

abstract class Assign {
	private int salary;

     int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
//	abstract void print();
}

class Manager1 extends Assign implements Salary {
	
	public void print() {
		System.out.println("Manager Salary   - " + getSalary());
	}
	
}

class Employee extends Assign implements Salary {
	public void print() {
		System.out.println("Employee1 Salary - " + getSalary());
	}

	public void print(int salary) {
		setSalary(salary);

		System.out.println("Employee2 Salary - " + getSalary());
	}
}