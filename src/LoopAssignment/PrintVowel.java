package LoopAssignment;

public class PrintVowel {

	public static void main(String[] args) {
		// Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
		
		System.out.println("-------for loop---------");
		
		for(char ch='a'; ch<='z'; ch++) {
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				System.out.println(ch + " is a vowel");
			}
		}
		
		System.out.println("=======while loop===========");
		
		char ch='a';
		while(ch<='z') {
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				System.out.println(ch + " is a vowel");		
			}
			ch++;
		}


	}

}
