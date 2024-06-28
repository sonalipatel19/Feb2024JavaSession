package StringAssignment;

import java.util.Arrays;

public class RemoveCharacterFromString {

	public static void main(String[] args) {
		//11. get only numeric part from this String:

		String s = "your transaction id is: 12345 and reference id is 34567";
		
		for(int i=0; i<s.length();i++) {
		if(Character.isDigit(s.charAt(i))) {
			char num = s.charAt(i);
			System.out.print(num);
			}
		
		}
		
		System.out.println("--------------------------");
		for(int i=0; i<s.length();i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
				char num = s.charAt(i);
				System.out.print(num);
				}
			
			}
		

	}

}
