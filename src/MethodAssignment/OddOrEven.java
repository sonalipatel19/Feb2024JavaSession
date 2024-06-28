package MethodAssignment;

public class OddOrEven {
	
	int a;
	
	public boolean odd(int a) {
		if(a%2==1) {
			System.out.println(a + " is an odd number");
		}
		return true;
	}
	
	public boolean even(int a) {
		if(a%2==0) {
			System.out.println(a + " is an even number");
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		//5. Def﻿ine a program to find out whether a given number is even or odd - return true/false.

		OddOrEven obj = new OddOrEven();
		obj.even(14);
		obj.odd(23);
	}

}
