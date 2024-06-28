package InheritanceAssignment;

public class Car extends Vehicle{
	
	static int numDoors = 4;
	
	public void playMusic() {
		System.out.println("Car -- play music");
	}
	
	@Override
	public void start() {
		System.out.println("Car -- start");
	}

}
