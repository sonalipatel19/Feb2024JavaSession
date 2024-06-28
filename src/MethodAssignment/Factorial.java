package MethodAssignment;

public class Factorial {
	
	int num;
	static int fact = 1;
	
	public void factorial(int num) {
		for(int i=1; i<=num; i++) {
			 fact = fact * i;
		}
		System.out.println("factorial of 5! : " + fact);
	}
	
	public static void main(String[] args) {
		//8. Write a program to print the factorial of a number by defining a method named 'Factorial'.
		//Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-

		Factorial f = new Factorial();
		f.factorial(5);
	}

}
