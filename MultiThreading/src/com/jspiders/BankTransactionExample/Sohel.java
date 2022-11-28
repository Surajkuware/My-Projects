package com.jspiders.BankTransactionExample;

public class Sohel extends Thread {
	Acount acount;
	
	public Sohel(Acount acount) {
		this.acount=acount;
	}
	@Override
	public void run() {
		acount.Withdrow(500);
		acount.Deposit(1500);
	}
}
