package com.jspiders.husbandwifemultithreading.main;

import com.jspiders.husbandwifemultithreading.HusbandThred.Husband;
import com.jspiders.husbandwifemultithreading.WifeThread.Wife;
import com.jspiders.husbandwifemultithreading.count.Account;

public class ThreadMain {

	public static void main(String[] args) {

		Account account = new Account(10000);

		Wife wife = new Wife(account);

		Husband husband = new Husband(account);

		wife.start();
		husband.start();
		
	}

}
