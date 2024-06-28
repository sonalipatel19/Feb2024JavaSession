package ArrayAssignment;

import java.util.Arrays;

public class Cricket {

	public static void main(String[] args) {
		// Q2: Write a program to create a static Array, having following cricket data:
		//name, age, team name, DOB, gender, Strike Rate
		//Try to create multiple Object Arrays for different players 
		//Try to print all the values of each player on the console using for and for each loops
		
		Object c1[] = new Object[6];
		c1[0] = "Hiten";
		c1[1] = "23";
		c1[2] = "Gold";
		c1[3] = "12/1/23";
		c1[4] = 'm';
		c1[5] = "50";
		 
		System.out.println("--------for loop------------");
		for(int i=0; i<c1.length; i++) {
			System.out.println(c1[i]);
		}
		System.out.println("-------for each loop-------------");
		
		for(Object e: c1)
			System.out.println(e);
		
		System.out.println(Arrays.toString(c1));
		
		Object c2[] = new Object[6];
		c2[0] = "Deep";
		c2[1] = 26;
		c2[2] = "Silver";
		c2[3] = "1/1/96";
		c2[4] = 'm';
		c2[5] = 75;
//		
		System.out.println("--------for loop------------");
		for(int j=0; j<c2.length; j++) {
			System.out.println(c2[j]);
		}
//		
		System.out.println("-------for each loop-------------");
		for(Object e: c2)
			System.out.println(e);
//		
		System.out.println(Arrays.toString(c2));
//		
		Object c3[] = new Object[6];
		c3[0] = "Parth";
		c3[1] = 29;
		c3[2] = "Diamond";
		c3[3] = "18/1/95";
		c3[4] = 'm';
		c3[5] = 100;
		
		System.out.println("--------for loop------------");
		for(int k=0; k<c3.length; k++) {
			System.out.println(c3[k]);
		}
		
		System.out.println("-------for each loop-------------");
		for(Object e: c3)
			System.out.println(e);
		
		System.out.println(Arrays.toString(c3));
	}

}
