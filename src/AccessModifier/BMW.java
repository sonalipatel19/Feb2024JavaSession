package AccessModifier;

public class BMW extends Car{
	
	@Override
	public void test() {
		System.out.println("bmw -- test");
	}

	public static void main(String[] args) {
		
		BMW b = new BMW();
		

	}

}
