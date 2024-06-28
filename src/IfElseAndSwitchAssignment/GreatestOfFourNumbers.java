package IfElseAndSwitchAssignment;

public class GreatestOfFourNumbers {

	public static void main(String[] args) {
		//1b. Find out the greatest number out of four different given numbers:
				//Input the 1st number: 25 
				//Input the 2nd number: 78 
				//Input the 3rd number: 87
				//Input the 4th number: 97

				int a = 25;
				int b = 78;
				int c = 87;
				int d = 97;
				
				if(a>b && a>c && a>d) {
					System.out.println("a is greater and its value is: "+a);
				}
				else if(b>c && b>d) {
					System.out.println("b is greater and its value is: "+b);
				}
				else if(c>d) {
					System.out.println("c is greater and its value is: "+c);
				}
				else {
					System.out.println("d is greater and its value is: "+d);
				}

	}

}
