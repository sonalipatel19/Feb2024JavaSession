package ExceptionHandling;

public class Customer {
	
	String name;

	public static void main(String[] args) {
		
		Customer obj = new Customer();
		obj = null;
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		
		try {
			int i = 9/3;
			obj.name = "Tom";
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming");
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			System.out.println("NPE is coming");
			e.printStackTrace();
		}
		
		catch(Exception e) {
			System.out.println("NPE is coming");
			e.printStackTrace();
		}
		
		System.out.println("bye");
	}

}
