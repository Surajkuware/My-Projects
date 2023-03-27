package com.jspiders.husbandwifemultithreading.count;

public class Account {

	double accountBalence;

	public Account(double accountBlence) {

		this.accountBalence = accountBlence;
	}

	public void CheckBalence() {
		System.out.println("Your Current Blence is : " + accountBalence);
	}

	synchronized public void Diposit(double amount) {
		accountBalence += amount;

		System.out.println( "rs Diposited Successfully");
		CheckBalence();
	}

	synchronized public void Withdraw(double amount) {
		
		if (accountBalence >= amount) {
			accountBalence -= amount;
			System.out.println(" withrwa successfully");
			CheckBalence();
		}else {
			System.out.println("Insufficient Balence ");
			
		}
	}

}
