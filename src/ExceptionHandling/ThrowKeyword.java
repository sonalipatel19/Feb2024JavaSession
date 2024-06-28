package ExceptionHandling;

import javax.management.RuntimeErrorException;

public class ThrowKeyword {

	public static void main(String[] args) {
		//  throw keyword is used when I want to throw by yourself
		
		String data = null;
		
		if(data==null) {
			throw new RuntimeErrorException(null, "DATA NOT FOUND EXCEPTION");
		}
		System.out.println("FILL THE FORM");
	}

}
