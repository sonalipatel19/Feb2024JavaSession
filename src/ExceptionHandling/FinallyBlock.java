package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("A");
		
		try {
			int i = 9/0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("bye");
	}

}

// usecase:
// close the browser
// disconnect DB
// close connection with excel/csv/text/file
