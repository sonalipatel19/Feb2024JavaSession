package LoopAssignment;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		//9. Print the following series using for and while loops:
		//a. Even Numbers Series: Write a Java program to print the series of even numbers from 2 to 100.
		
		System.out.println("---------for loop-----------");
		
		for(int i=2; i<=100; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("=====while loop=========");
		
		int i=1;
		while(i<=100) {
			i++;
			if(i%2==0) {
				System.out.println(i);	
			}
			
		}

	}

}
