package StringAssignment;

public class ReverseYourName {
	
	static String s = "sonali";
	static String rev = "";
	
	public static void reverseName() {
		
		for(int i= s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		
		System.out.println(rev);
	}

	public static void main(String[] args) {
		//5. Write a function/ method to reverse your own name.
		
		reverseName();
		
		
		
		
	}

}
