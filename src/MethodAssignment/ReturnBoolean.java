package MethodAssignment;

public class ReturnBoolean {
	//Method with Return Value (boolean) and with Parameters (String, String):
	//Assignment: Write a method to compare two strings and return true if they are equal, false otherwise.
	
//	String str1;
//	String str2;
	
//	public boolean compareStrings(String str1, String str2) {
//		if(str1.equals(str2)) {
//			System.out.println("String are same");
//		}else {
//			System.out.println("String are not same");
//		}
//		return true;
//		
//	}

	public static void main(String[] args) {
//		ReturnBoolean obj = new ReturnBoolean();
//		obj.compareStrings("Hello", "Testing");
		
		String str1 = "hello";
        String str2 = "test";
        
        boolean result = compareStrings(str1, str2);
        
        System.out.println("Are the strings equal? " + result);
    }

    public static boolean compareStrings(String str1, String str2) {
        // Check if both strings are null
        if (str1 == null && str2 == null) {
            return true;
        }
        // Check if one string is null while the other is not
        else if (str1 == null || str2 == null) {
            return false;
        }
        // Compare the strings
        return str1.equals(str2);

	}

}
