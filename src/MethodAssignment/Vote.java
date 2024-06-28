package MethodAssignment;

public class Vote {
	
	int age;
	
	public int vote(int age) {
	
		if(age>=18) {
			System.out.println("Person is eligible to vote");
		}else {
			System.out.println("Person is not eligible to vote");
		}
		return age;
	}

	public static void main(String[] args) {
		//6. A person is eligible to vote if his/her age is greater than or equal to 18.
		//Define a method to find out if he/she is eligible to﻿ vote. - return true/false
		
		Vote v = new Vote();
		v.vote(13);
	}

}
