package IfElseAndSwitchAssignment;

public class GreatestOfThreeNumbers {

	public static void main(String[] args) {
		//1a. Find out the greatest number out of three different given numbers:
				//Input the 1st number: 25 
				//Input the 2nd number: 78 
				//Input the 3rd number: 87
				
				int x = 25;
				int y = 78;
				int z = 87;
				
				if(x>y && x>z) {
					System.out.println("x is greater and its value is: "+x);
				}
				else if(y>z) {
					System.out.println("y is greater and its value is: "+y);
				}
				else {
					System.out.println("z is greater and its value is: "+z);
				}

	}

}
