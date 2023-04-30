package bankSystemSoftware;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter you 'name' and 'CustomerId' to access our bank services");
		String name = input.nextLine();
		String customerId = input.nextLine();
		BankAccount acct1 = new BankAccount(name, customerId);
		acct1.menu();

	}

}
