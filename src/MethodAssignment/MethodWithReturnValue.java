package MethodAssignment;

public class MethodWithReturnValue {
	
	//Method with Return Value (int) and with Parameters (int, int):
	//Assignment: Write a method to add two integers and return the result.

	public int add(int num1, int num2) {
		int num3 = num1 + num2;
		return num3;
		
	}


	public static void main(String[] args) {
		
		MethodWithReturnValue obj = new MethodWithReturnValue();
		obj.add(50, 50);

	}

}
