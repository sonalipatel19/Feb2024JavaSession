package IfElseAndSwitchAssignment;

public class CheckVowelOrConsonent {

	public static void main(String[] args) {
		//4. WAP to check given alphabet character is Vowel or Consonant using Switch - Case
		
				char vowel = 'e';
				
				switch(vowel) {
				
				case 'a': 
						System.out.println(vowel + " is a vowel");
						break;
						
				case 'e': 
					System.out.println(vowel + " is a vowel");
					break;
					
				case 'i': 
					System.out.println(vowel + " is a vowel");
					break;
					
				case 'o': 
					System.out.println(vowel + " is a vowel");
					break;
					
				case 'u': 
					System.out.println(vowel + " is a vowel");
					break;
				
				default:
					System.out.println(vowel + " is a consonant");
				}

	}

}
