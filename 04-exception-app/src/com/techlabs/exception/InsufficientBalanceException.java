package com.techlabs.exception;

public class InsufficientBalanceException extends Throwable{
	int accountnumber;
	String name;
	String accounttype;
	double balance;
	public InsufficientBalanceException(double balance) {
		
		this.balance = balance;
	}
	public String getMessage()
	{
		return"Insufficient amount"+balance;
	}
	
	

}
