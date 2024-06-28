package OOPInheritance;

public class CarTest {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start(); //overriden
		b.stop();// inherited
		b.refuel();//inherited
		b.autoParking();// individual method of child class
		b.engine();
		b.diesel();
		BMW.billing();// child class name can access parent class static method
		Car.billing();
		b.bmwService();
		
		System.out.println(b.minSpeed);
		System.out.println("----------");
		
		Audi au = new Audi();
		au.start();
		au.stop();
		au.refuel();
		au.engine();
		au.theifSafety();
		
	
		System.out.println("----------");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		System.out.println(c.minSpeed);
		
		System.out.println("----------");
		
		//child class object can be referred by parent class ref var.
		//Top casting/ Up casting
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		c1.drive();
		
		//down casting: not allowed in java
		
		//BMW b1 = (BMW) new Car();// ClassCastException
		
		System.out.println("----------");
		Vehicle v = new BMW();
		v.engine();
		v.drive();
		
		System.out.println("----------");
		
		Truck t = new Truck();
		t.drive();
		t.engine();
		t.heavyloading();

	}

}
