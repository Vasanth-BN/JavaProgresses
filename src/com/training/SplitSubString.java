package com.training;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SplitSubString {
    static Set<String> set=new TreeSet<>();
    static int count=0;
	public static void main(String[] args) {	
		String inputString ="vasanth";
		@SuppressWarnings("unused")
		String dupInp="",dupInp1="";
		printme(inputString.charAt(0));
		subStrings(inputString);
        for(int i=1;i<inputString.length();i++) {
        	printme(inputString.charAt(i));
        	dupInp=String.valueOf(inputString.charAt(i));
        	for(int j=i;j<inputString.length();j++) {
        		
        	dupInp1=inputString.substring(0, i)+inputString.substring(j+1);
        	subStrings(dupInp1);
        }
        	}
        for(String i:set) {
        	printme(i);
        }
        printme(count);
	}
	public static void printme(Object a) {
		
		System.out.println(a);
		count++;
	}
	public static String sorting(String s) {
		char [] arr=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			arr[i]=s.charAt(i);
		}
		Arrays.sort(arr);
		s="";
		for(int i=0;i<arr.length;i++) {
			s+=arr[i];
		}
		return s;
	}
	public static void subStrings(String inputString) {
		 for (int i = 0; i < inputString.length(); i++) 
	        {
	            StringBuilder subSring = new StringBuilder().append(inputString.charAt(i));
	             
	            for (int j = i+1; j < inputString.length(); j++) 
	            {
	                subSring.append(inputString.charAt(j));
	                 
	                set.add(subSring.toString());
	            }
	        }
	}
}

//	Scanner sc=new Scanner(System.in) ;
//	Set <String> arr=new TreeSet<>();
//	String s=sc.next();
//	sc.close();
//	String s1;
//	try {
//		for(int i=0;i<s.length();i++) {
//			for(int j=i+1;j<=s.length();j++) {
//				s1=s.substring(i,j);
//				arr.add(s1);
//			}
//		}
//		for(String w:arr){
//			System.out.println("\""+w+"\"");
//		}
//		
//	}
//	catch(Exception e) {
//		System.out.println(e);
//	}
//}