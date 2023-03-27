package com.jspiders.factorydesignpattern.menu;

public class Watch implements Flipcart{
			@Override
			public void purchaseItem() {
				// TODO Auto-generated method stub
			System.out.println("Ordering Watch");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Watch Ordered");
			}
}
