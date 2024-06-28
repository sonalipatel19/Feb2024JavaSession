package javasessions;

public class Customer {

	public void test() {
		System.out.println("test method");
	}
	
	public void test(int a) {
		System.out.println("test method " +a);
	}
	public void test(int a, int b) {
		System.out.println("test method " + (a + b));
	}
	public void test(int a , String b) {
		System.out.println("test method " + (a + b));
	}
	public void test(String a, int b) {
		System.out.println("test method " +(a + b));
	}
	public void test(String a, int b, float f) {
		System.out.println("test method " +(a + b + f));
	}
	public void test(float a, int b, String f) {
		System.out.println("test method " +(a + b + f));
	}
	
	//amazon:
	public void search() {
		
	}
	
	public void search(String name) {
			
		}
	
	public void search(String name, int price) {
		
	}
	
	public void search(String name, int price, String color) {
		
	}
	
	//payment:
	public void doPayment(String upi) {
		
	}
	public void doPayment(int cc, int ccv) {
			
		}
	public void doPayment(int cc, int ccv , int otp) {
		
	}
	public void doPayment(String paypalID, int pwd , int otp) {
		
	}
	
	//uber:
	public void booking(String start, String end) {
		
	}
	public void booking(String start, String end, String carType) {
			
	}
	public void booking(String start, String end, String carType, int persons) {
		
	}
	
	//login:
	public void doLogin() {
		
	}
	public void doLogin(String username, String pwd) {
			
	}
	public void doLogin(String username, String pwd, String role) {
		
	}
	public void doLogin(String socialMediaAccount, String pwd, int otp) {
		
	}
	

	public static void main(String[] args) {
	
		Customer obj = new Customer();
		obj.test();
		obj.test(10);
		obj.test(10, 20);
		obj.test("deep", 20, 20.23f);
	}

}
