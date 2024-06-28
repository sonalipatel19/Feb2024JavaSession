package javasessions;

public class Employees {
	
	// data members:
	//class variables/ global var
	String name;
	int age;
	double sal;
	boolean isPerm;
	
	
	

	public static void main(String[] args) {
		// create the object of the class: using new keyword
		
		Employees emp = new Employees();// new Employees is object and emp is reference var of the object
		emp.name = "tom";
		emp.age= 25;
		emp.sal= 25.32;
		emp.isPerm= true;
		
		System.out.println(emp.name);
		System.out.println(emp.age);
		
		Employees e1 = new Employees();
		System.out.println(e1.name);
		
		new Employees().name = "ekta";// no reference object
		
		//null reference objects
//		Employees e2 = new Employees();
//		e2.name = "kevin";
//		e2 = null;
//		e2.age = 30; // NullPointerException, because age is null
//		System.out.println(e2.age); 

		//
		Employees e3 = new Employees();
		e3.name = "neel";
		System.out.println(e3.name);
		
		e3 = null;
		e3 = new Employees();
		e3.name= "testing";
		e3.age=25;
		System.out.println(e3.name);
		System.out.println(e3.age);
		
		//
		Employees e4;
		e4 = new Employees();
	}

}
