package StringManipulation;

public class StringCapitalLetter {

	public static void main(String[] args) {
		
		String s = "this is my java code";// This Is My Java Code
		
		String s1[] = s.split(" ");
		String str = "";
		String rev = "";
		
		for(String e : s1) {
			str = str + e.replace(String.valueOf(e.charAt(0)), String.valueOf(e.charAt(0)).toUpperCase()) + " ";
			
		}
		System.out.println(str.trim());
		rev = rev + StringReverseTest.reverse(str)+ " ";
		
		System.out.println(rev.trim());
	}
	
	
	

}
