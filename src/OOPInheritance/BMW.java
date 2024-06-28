package OOPInheritance;

public class BMW extends Car{
	
	int minSpeed = 200;
	
	//Method Overriding: when we have a method in parent class and the same method in a child class with:
	//1. with the same name
	//2. with same number of parameters with the same sequence
	//3. with the same return type.
	
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}
	
//	@Override
//	public void engine() {
//		System.out.println("BMW -- engine");
//	}
	
	public void diesel() {
		System.out.println("BMW -- diesel");
	}
	
	public void autoParking() {
		System.out.println("BMW -- autoParking");
	}
	
//	public static void billing() {
//		System.out.println("BMW -- billing");
//	}
	
	private void service() {
		System.out.println("BMW -- service");
	}
	
	public void bmwService() {
		service();
	}

	
		
		



}
