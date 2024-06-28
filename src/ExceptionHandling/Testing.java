package ExceptionHandling;

public class Testing {

	public static void main(String[] args) {
		
		int a[] = new int[3];
		
		try {
		a[3] = 10;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOB Exception");
		}
		
		System.out.println("bye");
	}

}
