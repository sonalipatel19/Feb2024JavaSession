package StringManipulation;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		String str = "this is my java code and i am so happy and i am good";
		
		System.out.println(str.length());
		
		System.out.println("Lowest Index: " + 0);
		System.out.println("Highest Index: " + (str.length()-1));
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(7));
		System.out.println(str.charAt(8));
		//System.out.println(str.charAt(-1));// StringIndexOutOfBoundException
		
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf('a', str.indexOf('a')+1));
		
//		System.out.println(str.indexOf("java"));
//
//		String msg = "welcome null";
//		if(msg.indexOf("admin")==8) {
//		System.out.println("user name is found");
//		}
//		else {
//			System.out.println("user name is not found");
//		}
//		
//		//lower and upper case
//		String test = "selenium automation";
//		String pop = "SELENIUM TESTING";
//		System.out.println(test.toUpperCase());
//		System.out.println(test.toLowerCase());
//		
//		//trim(): remove space from corner
//		String un = " test automation ";
//		System.out.println(un.trim());
//		
//		//replace: it will replace the word from another word
//		String dob = "01-01-1990"; //01/01/1990
//		System.out.println(dob.replace("-", "/"));
//		
//		String loop = "I love testing";
//		System.out.println(loop.replaceAll("love", "enjoy"));
//		
//		//contains: 
//		String msg1 = "welcome admin";
//		System.out.println(msg1.contains("admin"));
//		
//		String url = "https://www.google.com";
//		System.out.println(url.contains("google"));
//		
//		//equals:
//		String t1 = "hello selenium";
//		String t2 = "hello Selenium";
//		System.out.println(t1.equals(t2));
//		System.out.println(t1.equalsIgnoreCase(t2));
//		
//		//split: 
//		String lang = "Java_Python_javascript_ruby";
//		String lg[] = lang.split("_");
//		System.out.println(lg[0]);
//		System.out.println(Arrays.toString(lg));
//		
//		String data = "xXtestingXxXSeleniumXXxxAutomation";
//		String d[] = data.split("xX");
//		System.out.println(d[0]);
//		System.out.println(d[1]);
//		System.out.println(d[2]);
//		
//		String rest = "testing | automation | cypress | selenium";
//		String r[] = rest.split("\\|");
//		System.out.println(r[0]);
//		System.out.println(r[1]);
//		
//		String pest = "testing.automation.cypress.selenium";
//		String p[] = pest.split("\\.");
//		System.out.println(p[0]);
//		System.out.println(p[1]);
//		
//		String word = "I love \"java\" coding";
//		System.out.println(word);

	}

}
