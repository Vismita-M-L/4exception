package com.techlabs.exception;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) throws InsufficientBalanceException {
	Scanner scanner=new Scanner(System.in);
	Account account = null;
	try
	{
	 account =new Account(12,"vismita","savings",20000);
	System.out.println(account);
	}
	catch(InsufficientBalanceException e)
	{
		System.out.println(e.getMessage());
		
	
		
	}
	int choice;
	do {
    System.out.println("1. Deposit");
    System.out.println("2. Withdraw");
    System.out.println("3. Show Balance");
    System.out.println("4. Exit");
    System.out.print("Enter your choice: ");
    choice = scanner.nextInt();
	
	switch (choice) {
    case 1:
    	 System.out.print("Enter amount to deposit: ");
         double depositAmount = scanner.nextDouble();
         account.setBalance(account.getBalance() + depositAmount);
         System.out.println("Amount deposited successfully.");
         break;
    case 2:
    	System.out.print("Enter amount to withdraw: ");
        double withdrawalAmount = scanner.nextDouble();
        if (withdrawalAmount <= account.getBalance()) {
            account.setBalance(account.getBalance() - withdrawalAmount);
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
        break;
        
    case 3:
    	System.out.println("Account Balance: " + account.getBalance());
        break;
    case 4:
    	System.out.println("Exiting...");
        break;
    default:
        System.out.println("Invalid choice. Please try again.");
        break;
	}
    } while (choice != 4);

    scanner.close();
}
}

