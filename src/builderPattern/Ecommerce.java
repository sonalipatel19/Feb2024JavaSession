package builderPattern;

public class Ecommerce {
	
	public Ecommerce login() {
		System.out.println("user logged in");
		return this;
	}
	
	public Ecommerce login(String username, String password) {
		System.out.println("user logged in with : " + username + " " +password);
		return this;
	}
	
	public Ecommerce search() {
		System.out.println("search with default products");
		return this;
	}
	
	public Ecommerce search(String productName) {
		System.out.println("search with products " + productName);
		return this;
	}
	
	public Ecommerce search(String productName, int price) {
		System.out.println("search with products" + productName + "price" + price);
		return this;
	}
	
	public Ecommerce addToCart(String productName) {
		System.out.println("add To Cart" + productName);
		return this;
	}
	
	public Ecommerce payment(String upi) {
		System.out.println("make payment via upi" + upi);
		return this;
	}
	
	public Ecommerce payment(String cc, int ccv) {
		System.out.println("make payment via upi" + cc + "ccv" + ccv);
		return this;
	}
	
	public Ecommerce generateOrder() {
		System.out.println("your order ID is :" + 12345);
		return this;
	}
	
	public Ecommerce logout() {
		System.out.println("user logged out");
		return this;
	}

}
