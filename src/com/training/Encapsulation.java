package com.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {
	 private  List<String> uName= new ArrayList<>();
	private List<String> uPass= new ArrayList<>();
	@SuppressWarnings("unused")
	private  String userName;
	@SuppressWarnings("unused")
	private  String pass;
	public String getUserName(String inp1) {
		if(uName.contains(inp1)) return inp1;else return "";
	}

	public String getPass(String inp2) {
		if(uPass.contains(inp2)) return inp2; else return "";
	}
	@SuppressWarnings("unused")
	private void addUserNAmes() {
		uName.add("Vasanth");
		uName.add("Jawahar");
		uPass.add("19");
		uPass.add("20");
		
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		User ab = new User();
		Scanner sc=new Scanner(System.in);
		String inp1=sc.nextLine();
		if(!(ab.getUserName(inp1)).equals("")) {

			String inp2=sc.next();
			if(ab.getPass(inp1).equals(inp2)) {
				System.out.println("Successfully Logged in");
			}
			else
				System.out.println("Sorry, You have entered wrong Password!");
		}
		else {
			System.out.println("Sorry, You have entered wrong Username!");
		}
		sc.close();
	}

}
