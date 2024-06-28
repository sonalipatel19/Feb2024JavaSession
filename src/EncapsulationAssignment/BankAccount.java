package EncapsulationAssignment;

public class BankAccount {
	
	private String accountNumber;
	private double balance;
	private String owner;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public double deposit(double a) {
		a = balance + a;
		return a;
		
	}
	
	public double withdraw(double a) {
		a = balance - a;
		return a;
		
	}
	
	public void printStatement(String accountNumber, String ownerName, double balance) {
		
	this.accountNumber = accountNumber;
	this.owner = ownerName;
	this.balance = balance;
		
	}
	
	

}
