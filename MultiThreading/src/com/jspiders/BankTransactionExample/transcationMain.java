package com.jspiders.BankTransactionExample;

public class transcationMain {

		public static void main(String[] args) {
			Acount acount=new Acount(6000);
			
			NikhilAc  Nac=new NikhilAc(acount);
			Sohel sohel=new  Sohel(acount);
			
			Nac.start();
			sohel.start();
		}
}
