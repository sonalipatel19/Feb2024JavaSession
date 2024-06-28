package constructor;

public class Car {

	String name;
	int price;
	String color;
	String licenseNumnber;
	String brand;
	
	public Car(String name, int price, String brand) {
		this.name = name;
		this.price = price;
		this.brand = brand;
	}

	public Car(String name, int price, String color, String licenseNumnber, String brand) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.licenseNumnber = licenseNumnber;
		this.brand = brand;
	}

	public Car(String name, int price, String licenseNumnber, String brand) {
		this.name = name;
		this.price = price;
		this.licenseNumnber = licenseNumnber;
		this.brand = brand;
	}

	public Car(String name, String brand) {
		this.name = name;
		this.brand = brand;
	}
	
}
