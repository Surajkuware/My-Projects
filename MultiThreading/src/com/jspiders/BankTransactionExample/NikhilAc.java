package com.jspiders.BankTransactionExample;

public class NikhilAc extends Thread {
	Acount acount;
	public NikhilAc(Acount acount) {
		this.acount=acount;
	}
@Override
	public void run() {
			acount.Deposit(2000);
			acount.Withdrow(1000);
	}

}
