package MethodAssignment;

public class PrintAddSubMulDiv {
	
	public void add(int a, int b) {
		int c = a + b;
		System.out.println("Addition of two numbers is: " +c);
	}
	
	public void sub(int a, int b) {
		int c = a - b;
		System.out.println("Subtraction of two numbers is: " +c);
	}
	
	public void mul(int a, int b) {
		int c = a * b;
		System.out.println("Multiplication of two numbers is: " +c);
	}
	
	public void div(int a, int b) {
		int c = a / b;
		System.out.println("Division of two numbers is: " +c);
	}

	public static void main(String[] args) {
		// 1.Write a program to print the addition/subtraction/division/multiplication of two numbers by defining your own method
		PrintAddSubMulDiv obj = new PrintAddSubMulDiv();
		obj.add(10, 20);
		obj.sub(20, 10);
		obj.mul(10, 20);
		obj.div(10, 5);
		
		

	}

}
