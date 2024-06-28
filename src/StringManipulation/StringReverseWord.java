package StringManipulation;

public class StringReverseWord {

	public static void main(String[] args) {

		String s = "this is my java code";
		String r = "";
		
		String rev[] = s.split(" ");
		for(String e : rev) {
			r = r + StringReverseTest.reverse(e)+ " ";
		}
		
		System.out.println(r.trim());
		

	}

}
