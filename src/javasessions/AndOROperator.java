package javasessions;

public class AndOROperator {

	public static void main(String[] args) {
		// AND -- & , &&
		
		boolean c1 = true;
		boolean c2 = false;
		boolean c3 = true;
		boolean c4 = true;
		
		//If any condition is false then overall condition will become false
		if(c1 & c2 & c3 & c4) {// true,true,false,true --> false
			System.out.println("hi");
		}else {
			System.out.println("bye");
		}
		
		// && -->it is also called short circuit
		if(c1 && c2 && c3 && c4) {// true,true,false,true --> false
			System.out.println("hello");
		}else {
			System.out.println("bye");
		}
		
		// OR -- |, ||
		
		boolean b1 = true;
		boolean b2 = true;
		boolean b3 = true;
		boolean b4 = false;
		
		if(b1 | b2 | b3 | b4) {// true,false,true,true --> true
			System.out.println("hi");
		}else {
			System.out.println("bye");
		}
		
		// || --> it is also called short circuit
		if(b1 || b2 || b3 || b4) {// true,false,true,true --> true
			System.out.println("hi");
		}else {
			System.out.println("bye");
		}
		
		// WAP - three different numbers
		
		int x = 100;
		int y = 200;
		int z = 300;
		
		if(x>y && x>z) {
			System.out.println("x is greater");
		} else if(y>z) {
			System.out.println("y is greater");
		}else {
			System.out.println("z is greater");
		}
	}

}
