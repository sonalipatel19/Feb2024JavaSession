package OOPAbstract;

public abstract class Page {
	
	// we cannot create object of Interface
	// can have abstract methods and non-abstract methods
	// can we have the constructor of abstract class? Yes
	// this will be called when you create the object of child class
	
	static final int TIME_OUT = 10;
	
	public Page() {
		System.out.println("Page -- default const...");
	}
	
	public Page(int a) {
		System.out.println("Page -- param const..." + a);
	}
	
	public Page(int a, int b) {
		System.out.println("Page -- two param const..." + a + b);
	}
	
	
	public abstract void title();
	
	public abstract void url();
	
	public static final void displayLogo() {
		System.out.println("Page -- display logo");
	}
	
	public void getPageInfo() {
		System.out.println("Page -- getPageInfo");
	}
	
	private void billing() {
		System.out.println("Page -- billing");
	}
	
	public void getBillingInfo() {
		billing();
	}
	
	
	
	
	

}
