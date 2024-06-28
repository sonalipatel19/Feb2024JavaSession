package javasessions;

public class Car {

	String name;
	String licenseNum;
	int price;
	static int wheels = 4;
	
	//instance vars: n copies
	//static vars: 1 copies
	
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.name= "Honda";
		c1.licenseNum = "12121";
		c1.price = 12;
		
		
		Car c2 = new Car();
		c2.name= "BMW";
		c2.licenseNum = "25252";
		c2.price = 15;
		
		
		Car c3 = new Car();
		c3.name= "Audi";
		c3.licenseNum = "35353";
		c3.price = 20;
		
		//so to call static variable we use classname:
		System.out.println(Car.wheels);
		
//		new Car();// no reference object
//		
//		Car c4 = new Car();
//		c4=null; //null reference
		

	}

}
