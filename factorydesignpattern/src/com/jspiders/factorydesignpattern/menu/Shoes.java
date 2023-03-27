package com.jspiders.factorydesignpattern.menu;

public class Shoes implements Flipcart {

	 @Override
	public void purchaseItem() {
	System.out.println("ordering shoes");
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 System.out.println("shows Delevered...Thank u ");
	}
	
}
