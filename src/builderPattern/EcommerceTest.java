package builderPattern;

public class EcommerceTest {

	public static void main(String[] args) {
		Ecommerce obj = new Ecommerce();
		
		obj.login()
			.search("Apple Macbook Pro")
				.addToCart("Apple Macbook Pro")
					.payment("2222 2222 2222 2222", 333)
						.generateOrder()
							.logout();
		
		System.out.println("-----------");
		
		obj.login("sonali" , "sonali123")
				.search("Nike", 2500)
					.logout();
						
	}

}
