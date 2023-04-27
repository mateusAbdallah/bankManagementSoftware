package bankSystemSoftware;

public class BankAccount {

	double balance;
	double newBalance;
	String customerName;
	String customerId;
	
	public BankAccount(String customerName, String customerId) {
		
		this.customerName = customerId;
		this.customerId = customerId;
	}
	
	void deposit(double amount) {
		if(amount != 0) {
			bal += amount;
			newBalance = amount;
		}
	}
}
