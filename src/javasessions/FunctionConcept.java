package javasessions;

public class FunctionConcept {
	// 1. no return and no input:
	public void test() {
		System.out.println("test method");
	}
	
	//2. with no input but some return:
	public void getInfo() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	
	public int getBillAmount() {
		System.out.println("getBillAmount");
		int foodBill = 100;
		int tax = 10;
		int finalAmount = foodBill + tax;
		return finalAmount;
	}
	
	public String getTrainerName() {
		System.out.println("getTrainerName");
		String name = "Sonali";
		return name;
	}

	//3. some input and some return:
	public int add(int a , int b) {
		System.out.println("add two numbers");
		int sum = a+b;
		return sum;
	}
	public static void main(String[] args) {
		
		FunctionConcept obj = new FunctionConcept();
		obj.test();
		obj.getInfo();
		int m = obj.getBillAmount();
		System.out.println(m);
		
		String n = obj.getTrainerName();
		System.out.println(n);
		
		int x = obj.add(10, 20);
		System.out.println(x);
		}
		
		
}
