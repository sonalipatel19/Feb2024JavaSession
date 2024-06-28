package SuperKeyword;

public class BMW extends Car{
	
	int speed = 200;
	int price = 500;
	
	public BMW() {
		super(20);
		System.out.println("BMW -- default const...");
	}
	
	public BMW(int a) {
		System.out.println("BMW -- one param const..." + a);
	}
	
	@Override
	public void loading() {
		System.out.println("BMW -- loading");
	}
	
	
	@Override
	public void display() {
		super.display();
		System.out.println(speed);//200
		int carSpeed = super.speed;
		System.out.println(carSpeed);//100
		System.out.println("BMW -- display");
		
		System.out.println(price);
		System.out.println(super.price);
		
		loading();
		super.loading();
		
	}
	
	public void drive() {
		super.display();
		System.out.println(super.speed);
	}


}
