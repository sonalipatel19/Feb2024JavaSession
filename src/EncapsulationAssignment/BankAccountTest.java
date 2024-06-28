package EncapsulationAssignment;

public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount b = new BankAccount();
		b.setAccountNumber("123456");
		b.setOwner("Tom");
		b.setBalance(30);
		
		System.out.println("AccountNumber: " + b.getAccountNumber() + " " + "OwnerName: " + b.getOwner() + " " + "Balance:" + " " + b.getBalance());
		
		b.setAccountNumber("987456");
		b.setOwner("Lucky");
		b.setBalance(40);
		
		b.printStatement(b.getAccountNumber(), b.getOwner(), b.getBalance());
		System.out.println("AccountNumber: " + b.getAccountNumber() + " " + "OwnerName: " + b.getOwner() + " " + "Balance:" + " " + b.getBalance());

		double add = b.deposit(10);
		System.out.println("Deposit: " +add);
		
		double sub = b.withdraw(10);
		System.out.println("Withdraw: " +sub);
		
	}

}
