package SuperKeyword;

public class Car extends Vehicle{
	
	int speed = 100;
	int price = 300;
	
	public Car() {
		System.out.println("Car -- default const...");
	}
	
	public Car(int a) {
		System.out.println("Car -- one param const..." + a);
	}
	
	public void display() {
		System.out.println("Car -- display");
	}

}
