package AccessModifier;

public class Car {
	
	public String name;
	private int price;
	protected double milage;
	String color;
	
	public void test() {
		System.out.println("car -- test");
	}
	
	public static void main(String[] args) {
		
		Car c = new Car();
		
	}

}
