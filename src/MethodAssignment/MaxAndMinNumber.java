package MethodAssignment;

public class MaxAndMinNumber {
	
	
	int a;
	int b;
	int c;
	
	public void max(int a, int b, int c) {
		
		if(a>b && a>c) {
			System.out.println("a is maximum with the value: " + a);
		}
		else if (b>c) {
			System.out.println("b is maximum with the value: " + b);
		}
		else {
			System.out.println("c is maximum with the value: " + c);
		}
	}
	
	public void min(int a, int b, int c) {
		
		if(a<b && a<c) {
			System.out.println("a is minimum with the value: " + a);
		}
		else if (b<c) {
			System.out.println("b is minimum with the value: " + b);
		}
		else {
			System.out.println("c is minimum with the value: " + c);
		}
	}
	

	public static void main(String[] args) {
		//4. Define two methods to print the maximum and the minimum number respectively among three numbers.
		
		MaxAndMinNumber m = new MaxAndMinNumber();
		 m.max(88, 45, 69);
		 m.min(88, 45, 69);
	}

}
