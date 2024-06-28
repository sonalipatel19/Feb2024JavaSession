package OOPInterface;

public interface USMedical extends WHO{

	public static int MIN_FEE = 10;
	
	// interface methods can not have method body
	// abstract methods : no method body
	// cannot create object of the interface 
	
	public void physioServices();
	
	public void physioServices(int a);
	
	public void oncologyServices();
	
	public void dentalServices();
	
	public void emergencyServices();
	
	public void ENTServices();
	
	//after jdk 1.8:
	//1. can have a static method with method body
	
	public static void billing() {
		System.out.println("US -- billing");
	}
	
	//2. can have default method with method body: non static
	
	default void helpDesk() {
		System.out.println("US -- helpDesk");
	}
	
	
	
	
	
	
}
