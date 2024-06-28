package StringManipulation;

public class StringReverseTest {
	
	public static String reverse(String s) {
		
		if(s == null) {
			return null;
		}
		
		if(s.isBlank() || s.isEmpty()) {
			return s;
		}
		
		int len = s.length();
		if(len ==1) {
			return s;
		}
		
		String rev = "";
		for(int i = len-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		return rev.trim();
	}
	

	public static void main(String[] args) {
	
		String s = "Selenium";
		System.out.println(reverse(s));
		System.out.println(reverse("testing"));
		System.out.println(reverse(""));
		System.out.println(reverse(null));
		System.out.println(reverse("123"));
		System.out.println(reverse("t "));
		
		

	}

}
