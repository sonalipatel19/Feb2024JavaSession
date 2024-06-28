package StringAssignment;

public class ThirdEOfString {

	public static void main(String[] args) {
		//7. Write a program to get the 3rd  “ e “ of the string 
		
		String s = "Welcome to Naveen Automation Labs";
		
		System.out.println(s.indexOf('e'));
		int str = s.indexOf(('e'), s.indexOf('e')+ s.indexOf('e')+ s.indexOf('e')+1);
		System.out.println(str);

	}

}
