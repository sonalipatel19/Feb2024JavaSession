package MethodAssignment;

public class ConcatenateStringArray {
	//Method with Return Value (String) and with Parameters (String[]):
	//Assignment: Write a method to concatenate all strings in a string array and return the concatenated string.
	
		 public static String concatenateStrings(String[] myStr) {
			
			 String finalStr = "";
			 for(String e : myStr) {
				 finalStr = finalStr + e;
			 }
			 return finalStr;
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[] = {"Naveen", "Automation", "Labs", "Java", "Selenium"};
		String s = concatenateStrings(str);
		System.out.println(s);
	}

}
