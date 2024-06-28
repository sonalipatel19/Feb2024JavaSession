package javasessions;

public class CharacterConcept {

	public static void main(String[] args) {
		
		char c1 = 'a';
		char c2 = 'b';
		char c3 = 'M';
		
		System.out.println(c1);
		System.out.println(c2);
		
		//when we add to character then it will consider its ASCII value
		//range: a-z = 97-122
		// A-Z = 65-90
		//0-9 = 48-57
		//special char = 32-47 & 58-64
		
		System.out.println(c1+c2);//97+98=195
		System.out.println(c1-c2);//-1
		System.out.println(c2-c1);//1
		System.out.println(c1*c2);//9506
		
		System.out.println((byte)c1);//97 it will check whether it will convert in to byte or not
		System.out.println(0+c1);//97
		System.out.println(0+'a');//97
		System.out.println(0+'M');//77
		
		System.out.println(0+'$');//36
		System.out.println((byte)'$');//36
		System.out.println((byte)c3);//77

	}

}
