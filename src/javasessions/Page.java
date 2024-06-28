package javasessions;

// NS call NS -- its call directly
//S call S -- its call directly
//S call NS -- we need to create obj for NS method
//NS call S -- we can call directly

public class Page {
	
	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	public void m3() {
		System.out.println("m3 method");
		
	}
	
	public static void t1() {
		System.out.println("t1 method");
		t2();
	}
	public static void t2() {
		System.out.println("t2 method");
		t3();
	}
	public static void t3() {
		System.out.println("t3 method");
		//t1();
		Page obj1 = new Page();
		obj1.m1();
	}
	
	public static void main(String[] args) {
		
		Page obj = new Page();
		//obj.m1();
		t1();
		
	}

}
