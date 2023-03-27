package com.jspiders.factorydesignpattern.menu;

public class Shirts implements Flipcart{
	
		@Override
		public void purchaseItem() {
			// TODO Auto-generated method stub
		
			System.out.println("Ordering Shirts...");
		
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Shirts Delevered ...thank u");
		}
}
