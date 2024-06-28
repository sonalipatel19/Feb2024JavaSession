package LoopAssignment;

public class FloatingPointNumbers {

	public static void main(String[] args) {
		// 9. Print the following series using for and while loops:
		//c.  Write a Java program to print the series of floating-point numbers from 1.0 to 10.0.
		
		System.out.println("--------for loop--------------");
		
		for(float i=1.0f; i<=10.0; i++) {
			System.out.println(i);
		}
		
		System.out.println("========while loop=============");
		
		float i= 1.0f;
		while(i<=10.0) {
			System.out.println(i);
			i++;
		}

	}

}
