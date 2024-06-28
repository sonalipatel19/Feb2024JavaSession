package ConstructorAssignment;

public class CarTest {

	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println("Make" + "=" + c.make + " " + "Model" + "=" + c.model +  " " +  "Year" + "=" + c.year);

		Car c1 = new Car("Honda", "H23", 2000);
		System.out.println("Make" + "=" + c1.make + " " + "Model" + "=" + c1.model +  " " +  "Year" + "=" + c1.year);
		
	}

}
