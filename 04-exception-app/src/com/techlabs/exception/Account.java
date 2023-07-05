package com.techlabs.exception;

public class Account{
	private int accountnumber;
	private String name;
	private String accounttype;
	private double balance;
	public Account(int accountnumber, String name, String accounttype, double balance) throws InsufficientBalanceException {
		super();
		this.accountnumber = accountnumber;
		this.name = name;
		this.accounttype = accounttype;
		if(balance<5000)
			throw new InsufficientBalanceException( balance);
		this.balance = balance;
	}
	
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) throws InsufficientBalanceException {
        if (balance < 5000) {
            throw new InsufficientBalanceException("Minimum balance of 5000 Rs is required.");
        }
        this.balance = balance; 
		
	}
	@Override
	public String toString() {
		return "Account [accountnumber=" + accountnumber + ", name=" + name + ", accounttype=" + accounttype
				+ ", balance=" + balance + "]";
	}
	

}
