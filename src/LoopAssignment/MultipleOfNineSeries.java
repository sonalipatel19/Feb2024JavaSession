package LoopAssignment;

public class MultipleOfNineSeries {

	public static void main(String[] args) {
		//  9. Print the following series using for and while loops:
	//d. Develop a Java program to print the series of numbers where each number is a multiple of 9, starting from 0 and ending at 99.
		
		System.out.println("---------for loop---------");
		
		for(int i=0; i<=99; i++) {
			if(i%9==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("========while loop=========");
		
		int i=0;
		while(i<=99) {
			i++;
			if(i%9==0) {
				System.out.println(i);
			}	
		}

	}

}
