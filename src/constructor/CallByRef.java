package constructor;

public class CallByRef {
	
	String name;
	int age;
	
	public static void test(CallByRef t1) {
		System.out.println("test method");
		System.out.println(t1.name);
		System.out.println(t1.age);
	}

	public static void main(String[] args) {

		CallByRef ref = new CallByRef();
		ref.name = "sonali";
		ref.age=25;
		
		System.out.println(ref.name);
		System.out.println(ref.age);
		
		test(ref);

		

	}

}
