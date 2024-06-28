package javasessions;

public class ConditionalStatement {

	public static void main(String[] args) {
		
		int a =100;
		int b = 200;
		
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}

		if(true) {
			System.out.println("Pass");
		}
//		else { //dead code
//			System.out.println("Fail"); // dead code means it does not make any sense to right like this because it does not assign any variable.
//		}
		
//		if(false) {
//			System.out.println("Fail");
//		}// dead code
		
		boolean flag = false;
		if(flag) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		//nested if
		int marks = 100;
		if(marks<=100) {
			System.out.println("calculating grade");
			if(marks>=90) {
				System.out.println("grade A");
				if(marks>=95) {
					System.out.println("grade A++");
					if(marks==100) {
						System.out.println("eligible for the scholarship");
					}
				}
			}
			else {
				System.out.println("grade B");
				if(marks<=50) {
					System.out.println("grade C");
				}
			}
		}
		else {
			System.out.println("marks not valid");
		}
		
		//if-if-if-if-else
		String browser = "safari";
		if(browser.equals("chrome")) {
			System.out.println("launch chrome");
		}if(browser.equals("firefox")){
			System.out.println("launch firefox");
		}if(browser.equals("edge")){
			System.out.println("launch edge");
		}if(browser.equals("safari")){
			System.out.println("launch safari");
		}else {
			System.out.println("plz pass the right browser name: " +browser);
		}
		
		//if-else if
//		String browser ="edge";
//		if(browser.equals("chrome")) {
//			System.out.println("launch chrome");
//		}else if(browser.equals("firefox")) {
//			System.out.println("launch firefox");
//		}else if(browser.equals("edge")) {
//			System.out.println("launch edge");
//		}else if(browser.equals("safari")) {
//			System.out.println("launch safari");
//		} else {
//			System.out.println("plz pass the right browser name: " +browser);
//		}
		
		
		
		
		
	}

}
