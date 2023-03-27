package com.jspiders.husbandwifemultithreading.HusbandThred;

import com.jspiders.husbandwifemultithreading.count.Account;

public class Husband extends Thread {

	Account account;

	public Husband(Account account) {

		this.account = account;

	}
	
	@Override
	public void run() {
		
		account.Diposit(1000);
		account.Withdraw(2000);
	}

}
