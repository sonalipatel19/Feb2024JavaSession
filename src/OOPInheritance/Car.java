package OOPInheritance;

//final class not be a parent class --> preventing inheritance
public class Car extends Vehicle{
	
	int minSpeed = 100;
	
	//final method cannot be overridden
	public void testDrive() {
		System.out.println("Car -- test Drive");
	}
	
	public void start() {
		System.out.println("Car -- start");
	}
	
	public void stop() {
		System.out.println("Car -- stop");
	}
	
	public void refuel() {
		System.out.println("Car -- refuel");
	}
	
	@Override
	public void engine() {
		System.out.println("Car -- engine");
	}
	
	//static method cannot be overridden
	//Method Hiding: static method in parent class and same static method in child class
	public static void billing() {
		System.out.println("Car -- billing");
	}
	
	//private method can not be overridden
	private void service() {
		System.out.println("Car -- service");
	}
	


}
