package InheritanceAssignment;

public class TestVehicle {

	public static void main(String[] args) {

		Vehicle v = new Vehicle();
		v.brand = "Audi";
		v.model = "A16";
		v.year = 2000;
		v.accelerate();
		v.start();
		
		System.out.println(v.brand + " " + v.model + " " + v.year);
		
		Car c = new Car();
		c.start();
		System.out.println(c.model = "K12");
		c.playMusic();
		System.out.println(Car.numDoors);
		
		Motorcycle m = new Motorcycle();
		m.stop();
		System.out.println(Motorcycle.engineType);
		
		Truck t = new Truck();
		t.start();
		System.out.println(Truck.cargoCapacity);
		
		Vehicle e = new Car();
		e.start();
		
	

		

	}

}
