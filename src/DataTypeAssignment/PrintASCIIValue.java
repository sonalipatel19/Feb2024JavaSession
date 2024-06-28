package DataTypeAssignment;

public class PrintASCIIValue {

	public static void main(String[] args) {
		//7. Print the ASCII value of the character 'h'.
		
		char value = 'h';
		System.out.println("ASCII value of h is :" +(0+value));//104  OR 	
		System.out.println("ASCII value of h is :" +(byte)value);//104
		
	//8. Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.
		
		char ch1 = 'd';
		int ch2 = (3+ch1);//3+100=103
		System.out.println((char)ch2);//g--> character at 103 is g

	}

}
