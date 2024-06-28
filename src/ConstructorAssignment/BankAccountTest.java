package ConstructorAssignment;

public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount b = new BankAccount("123456789ASD", 50);
		System.out.println("AccountNumber" + "=" + b.accountNumber + " " + "Balance" + "=" + b.balance);
		
		double add = b.deposit(20);
		System.out.println("Deposit: " +add);
		
		double sub = b.withdraw(20);
		System.out.println("Withdraw: " +sub);
		
		BankAccount b1 = new BankAccount("1454643646", 100);
		System.out.println("AccountNumber" + "=" + b1.accountNumber + " " + "Balance" + "=" + b1.balance);
		
		double add1 = b1.deposit(20);
		System.out.println("Deposit: " +add1);
		
		double sub1 = b1.withdraw(20);
		System.out.println("Withdraw: " +sub1);

	}

}
