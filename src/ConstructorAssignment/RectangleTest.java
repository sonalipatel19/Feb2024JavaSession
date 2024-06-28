package ConstructorAssignment;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		System.out.println("Length" + "=" + r.length + " " + "Width" + "=" + r.width);

		Rectangle r1 = new Rectangle(20.00, 25.00);
		System.out.println("Length" + "=" + r1.length + " " + "Width" + "=" + r1.width);
		
		double area = r1.calculateArea();
		System.out.println(area);
		
		
	}

}
