package StringAssignment;

public class VerifyWordOrChar {

	public static void main(String[] args) {
		//4. Write a program to verify a word or a character contained in the sentence.
		
		String s = "my name is sonali";

		boolean word = s.contains("w");
		System.out.println(word);
		
		boolean character = s.contains("sonali");
		System.out.println(character);
	}

}
