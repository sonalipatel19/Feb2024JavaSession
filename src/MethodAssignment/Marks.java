package MethodAssignment;

public class Marks {
	
	int num;
	
	public void getData(int num) {
		
		if(num>= 91-100) {
			System.out.println("Student get AA Grade");
		}
		else if(num>=81 && num<=90) {
			System.out.println("Student get AB Grade");
		}
		else if(num>=71 && num<=80) {
			System.out.println("Student get BB Grade");
		}
		else if(num>=61 && num<=70) {
			System.out.println("Student get BC Grade");
		}
		else if(num>=51 && num<=60) {
			System.out.println("Student get CD Grade");
		}
		else if(num>=41 && num<=50) {
			System.out.println("Student get DD Grade");
		}
		else if (num<=40) {
			System.out.println("Student Fail");
		}
	}
	
	
	
	public static void main(String[] args) {
		//7. Write a program which will ask the user to enter his/her marks (out of 100). 
		//Define a method that will display grades according to the marks entered as below:
		//Marks        Grade
		//91-100         AA
		//81-90          AB
		//71-80          BB﻿
		//61-70          BC
		//51-60          CD
		//41-50          DD
		//<=40          Fail
		
		Marks m1 = new Marks();
		m1.getData(92);

	}

}
