package LoopAssignment;

public class ReverseAlphabet {

	public static void main(String[] args) {
		// 9. Print the following series using for and while loops:
	    //b. Develop a Java program to print the series of lowercase alphabets in reverse order from 'z' to 'a'.
		
		System.out.println("=======for loop=======");
		
		for(char ch='z'; ch>='a'; ch--) {
			System.out.println(ch);
		}
		
		System.out.println("----------while loop----------");
		
		char ch='z';
		while(ch>='a') {
			System.out.println(ch);
			ch--;
		}

	}

}
