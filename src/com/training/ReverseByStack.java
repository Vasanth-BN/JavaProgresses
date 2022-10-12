package com.training;

import java.util.*;

public class ReverseByStack {
	public static String reverseByStack(String s)  {
		if (s.length() < 1) {
			throw new IndexOutOfBoundsException("Enter a value");
		} else {
			Stack<String> s1 = new Stack<>();
			for (int i = 0; i < s.length(); i++) {
				s1.push(String.valueOf(s.charAt(i)));
			}
			s = "";
			while (s1.size() > 0) {
				s = s + s1.pop();
			}
			return s;
		}
	}
}
