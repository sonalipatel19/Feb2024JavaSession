package ExceptionHandling;

public class Student {
	
	public static int getMarks(String name) {
		System.out.println("getting marks for : " + name);
		
		if(name.equals("ravi")) {
			
			try {
				int i = 9/3;
				//System.exit(1);// shut down JVM it will not go to the finally block here the code will terminated.
				return 50;
			}
			catch(ArithmeticException e) {
				System.out.println("AE is coming..");
				return 20;
			}
			finally {
				System.out.println("finally block");
				//return 80;
			}
		}
		else if (name.equals("tom")) {
			return 95;
		}else if (name.equals("naveen")) {
			return 10;
		}  
		else {
			System.out.println("student not found...");
			return -1;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		int m1 = getMarks("tom");
		System.out.println(m1);

	}

}
