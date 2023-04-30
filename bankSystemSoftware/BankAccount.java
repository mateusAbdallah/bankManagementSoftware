package bankSystemSoftware;

import java.util.Scanner;

public class BankAccount {

	double balance;
	double prevTrans;
	String customerName;
	String customerId;
	
	public BankAccount(String customerName, String customerId) {
		
		this.customerName = customerName;
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
	
	void getPreviousTrans() {
		if(prevTrans>0) 
			System.out.println("Deposited: " + prevTrans);
		else if(prevTrans<0)
			System.out.println("Withdraw: " + Math.abs(prevTrans));
		else
			System.out.println("No transaction occured");
	}
	
	void menu() {
		char option;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome " + customerName);
		System.out.println("Your ID: " + customerId);
		System.out.println("\n");
		System.out.println("a) Check Balance");
		System.out.println("b) Deposit Amount");
		System.out.println("c) Withdraw Amount");
		System.out.println("d) Previous Transaction");
		System.out.println("e) Exit");
		
		do {
			System.out.println("***************");
			System.out.println("Choose an option");
			option = input.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			case 'a' :
				System.out.println("---------------");
				System.out.println("Balance " + balance);
				System.out.println("---------------");
				System.out.println("\n");
				break;
			case 'b' :
				System.out.println("---------------");
				System.out.println("Enter a amount to deposit ");
				System.out.println("---------------");
				double amt = input.nextDouble();
				deposit(amt);
				System.out.println("\n");
				break;
			case 'c' :
				System.out.println("---------------");
				System.out.println("Enter a amount to withdraw ");
				System.out.println("---------------");
				double amtW = input.nextDouble();
				withdraw(amtW);
				System.out.println("\n");
				break;
			case 'd' :
				System.out.println("---------------");
				System.out.println("Previous transaction: ");
				getPreviousTrans();
				System.out.println("---------------");
				System.out.println("\n");
				break;
			case 'e' :
				System.out.println("---------------");
				break;
				default : 
					System.out.println("Select a correct option to proceed");
					break;
			}
			
			
		}while(option != 'e');
		
		System.out.println("Trank you for using our services ");
	}
}
