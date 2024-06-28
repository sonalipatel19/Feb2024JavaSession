package IfElseAndSwitchAssignment;

public class LaunchBrowser {

	public static void main(String[] args) {
		//7. WAP to launch browsers using If-ElseIf and Switch Case.
				//a. Browser: Chrome/Firefox/IE/Safari
				//b. If user passes wrong browser, print please pass the right browser name
				
				String browser = "Chrome";
				
				switch (browser.trim().toLowerCase()) {
				case "chrome":
					System.out.println("Launch Chrome");
					break;
					
				case "firefox":
					System.out.println("Launch Firefox");
					break;
					
				case "ie":
					System.out.println("Launch IE");
					break;
					
				case "safari":
					System.out.println("Launch Safari");
					break;

				default:
					System.out.println("please pass the right browser name....");
				}
				

				// using if- else if statement
				
				if(browser.toLowerCase().equals("chrome")) {
					System.out.println("Launch Chrome");
				}
				else if(browser.toLowerCase().equals("firefox")) {
					System.out.println("Launch Firefox");
				}
				else if(browser.toLowerCase().equals("ie")) {
					System.out.println("Launch IE");
				}
				else if(browser.toLowerCase().equals("safari")) {
					System.out.println("Launch Safari");
				}
				else {
					System.out.println("please pass the right browser name....");
				}

	}

}
