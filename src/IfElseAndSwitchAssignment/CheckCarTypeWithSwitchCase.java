package IfElseAndSwitchAssignment;

public class CheckCarTypeWithSwitchCase {

	public static void main(String[] args) {
		//6. WAP to book the specific type of car from the Uber app using Switch - Case. 
				//a. Car Type: Mini, Sedan, SUV, Premium
				//b. If user passes wrong car type, print please select the right car type
				
				String carType = "SUV";
				
				switch (carType.trim().toLowerCase()) {
				case "mini":
					System.out.println("This is Mini car");
					break;
					
				case "sedan":
					System.out.println("This is Sedan car");
					break;
					
				case "suv":
					System.out.println("This is SUV car");
					break;
					
				case "premium":
					System.out.println("This is Premium car");
					break;

				default:
					System.out.println("please select the right car type....");
				}

	}

}
