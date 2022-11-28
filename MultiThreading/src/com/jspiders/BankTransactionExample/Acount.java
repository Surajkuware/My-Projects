package com.jspiders.BankTransactionExample;

public class Acount {

	double AcountBalance;

	public Acount(double acountBalance) {
		super();
		AcountBalance = acountBalance;
	}
	public void CheckBalance() {
		System.out.println( AcountBalance);
		
	}
	synchronized public void Deposit(double amount) {
		AcountBalance+=amount;
		CheckBalance();
	}
	synchronized public void Withdrow(double amount) {
		if (AcountBalance>=amount) {
			AcountBalance-=amount;
			CheckBalance();
		}
		else {
			System.out.println("You do not have sufficient Balence");
		}
	}
	
	
	
}
