package com.jspiders.husbandwifemultithreading.WifeThread;

import com.jspiders.husbandwifemultithreading.count.Account;

public class Wife extends Thread {

	Account account;

	public Wife(Account account) {
		this.account = account;

	}

	@Override
	public void run() {
			account.Withdraw(3000);
			account.Diposit(1000);
	}

}
