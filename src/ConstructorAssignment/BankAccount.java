package ConstructorAssignment;

public class BankAccount {
	
	String accountNumber;
	double balance;
	
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public double deposit(double num) {
		num = num + balance;
		return num;
	}
	
	public double withdraw(double sub) {
		sub = balance - sub;
		return sub;
	}
	

}
