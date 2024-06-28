package IfElseAndSwitchAssignment;

public class CheckEnvWithSwitchCase {

	public static void main(String[] args) {
		//5. WAP to run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod using using Switch - Case
		
				String env = "QA";
				
				switch (env.trim().toUpperCase()) {
				case "QA":
					System.out.println("This is QA Enivronment");
					break;
					
				case "STAGE":
					System.out.println("This is Stage Enivronment");
					break;
					
				case "DEV":
					System.out.println("This is Dev Enivronment");
					break;
					
				case "UAT":
					System.out.println("This is UAT Enivronment");
					break;
					
				case "PROD":
					System.out.println("This is Production Enivronment");
					break;

				default:
					System.out.println("plz right the correct environment....");
				}

	}

}
