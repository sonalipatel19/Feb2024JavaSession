package MethodAssignment;

public class AreaOfCircle {

	int radius;
	static final double pi = 3.14;
	
	public double circle(int radius) {
		double areaOfCircle = pi * radius * radius;
		return areaOfCircle;
	}
	
	public double circumference(int radius) {
		double circumferenceOfCircle = 2 * pi * radius;
		return circumferenceOfCircle;
	}
	
	
	public static void main(String[] args) {
		// 3.Write a program to print the circumference and area of a circle of radius entered by user by defining your own method. 

		AreaOfCircle c = new AreaOfCircle();
		double area = c.circle(2);
		System.out.println("Area of Circle is: " +area);
		
		double circum = c.circumference(2);
		System.out.println("Circumference of Circle is: " +circum);
	}

}
