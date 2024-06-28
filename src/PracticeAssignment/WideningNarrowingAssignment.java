package PracticeAssignment;

public class WideningNarrowingAssignment {

	public static void main(String[] args) {
		//1. Write a Java program that demonstrates widening casting. 
		//Create variables of different data types such as int, float, double, etc. 
		//Assign values to them and then cast them to a higher data type. 
		//Finally, print out the original and casted values to observe widening casting in action.

		int a = 100;
		float b = 12.24f;
		double c = 22.23;
		
		long a1 = a;
		double b1 = b;
		double c1 = c;
		
//		System.out.println(a1 + "=" +a);//100
//		System.out.println(b1 + "=" +b);//12.23
//		System.out.println(c1 + "=" +c);//22.23
		
		//2. Develop a Java program to illustrate narrowing casting. 
		//Declare variables of higher data types like double, float, long, etc., 
		//and assign values to them. Then, cast these variables to lower data types like int, short, byte, etc. 
		//Print out the original and casted values to observe narrowing casting in action.
		
		double d = 52.23;
		float f = 45.23f;
		long l = 1000;
		
		int i = (int)d;
		short s = (short)f;
		byte j = (byte)l;
		
		System.out.println("Convert double to int " + d + " = " +i);
		System.out.println("Convert float to short " + f + " = " +s);
		System.out.println("Convert long to byte " + l + " = " +j);
	}

}
