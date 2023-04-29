package bankSystemSoftware;

public class BankAccount {

	double balance;
	double prevTrans;
	String customerName;
	String customerId;
	
	public BankAccount(String customerName, String customerId) {
		
		this.customerName = customerId;
		this.customerId = customerId;
	}
	
	void deposit(double amount) {
		if(amount != 0) {
			balance += amount;
			prevTrans = amount;
		}
	}
	
	void withdraw(double amt) {
		if(balance < amt)
			System.out.println("Bank balance insufficient");
		else if(amt != 0 && balance >= amt) {
			balance -= amt;
			prevTrans -= amt;
		}
	}
}
