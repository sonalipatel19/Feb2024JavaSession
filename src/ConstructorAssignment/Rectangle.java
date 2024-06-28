package ConstructorAssignment;

public class Rectangle {
	
	double length;
	double width;
	
	public Rectangle() {
		this.length = length;
		this.width = width;
	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double calculateArea() {
		 double areaOfRec = length * width;
		 return areaOfRec;
	}
	
	private Rectangle(double length) {
		this.length = length;
	}
	
	

}
