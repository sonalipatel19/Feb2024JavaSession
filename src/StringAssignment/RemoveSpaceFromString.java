package StringAssignment;

public class RemoveSpaceFromString {

	public static void main(String[] args) {
		//2. Remove all  spaces in a String 
		
		String s = "  Hello      Everyone  ";
		
		System.out.println(s.trim());
		String str = s.replaceAll("\\s", "");
		System.out.println(str);

		String st = s.replace(" ", "");
		System.out.println(st);
	}

}
