package MethodAssignment;

public class ProductOfTwoNumbers {
	
	public double product(double a, double b) {
		double c = a * b;
		return c;
	}

	public static void main(String[] args) {
		// 2. Define a method that returns the product of two double numbers.
		
		ProductOfTwoNumbers obj = new ProductOfTwoNumbers();
		double d = obj.product(2.5, 2.5);
		System.out.println("Poduct of Two double numbers is: " +d);

	}

}
