package IfElseAndSwitchAssignment;

public class CheckLoanType {

	public static void main(String[] args) {
		//8. WAP to define the interest rate on the basis of Loan type using Switch Case
				//a. Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
				//b. For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan
				
				String loanType = "Housing loan";
				int salary = 45000;
				double interestRate = 0.0;
				
				
				switch (loanType.trim().toLowerCase()) {
				case "car loan":
					interestRate = 5.0;
					break;
					
				case "housing loan":
					
						if(salary<=35000) {
							System.out.println("Sorry! Not Applicable for Housing Loan...");
						}
						interestRate = 7.0;
					break;
					
				case "personal loan":
					interestRate = 4.0;
					break;
					
				case "education loan":
					interestRate = 3.5;
					break;

				default:
					System.out.println("please select the right loan type.....");
				}
				System.out.println("Interest Rate of " +loanType + " is: " + interestRate);

	}

}
