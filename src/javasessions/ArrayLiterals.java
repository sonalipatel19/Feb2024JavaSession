package javasessions;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {
		// we can store array in two types:
		
		
		//1. using new keyword:
		int n[] = new int[5];
		
		//2. using ArrayLiterals:
		
		int p[]= {1,5,7,8,22,44,95,78};
		System.out.println(p.length);
		System.out.println("li" + "=" + 0);
		System.out.println("hi" + "=" + (p.length-1));
		
		System.out.println(Arrays.toString(p));
		
		for(int e : p) {
			System.out.println(e);
		}
		
		String students[] = {"sonali", "priya", "tom", "neel"};
		System.out.println(Arrays.toString(students));
		

	}

}
