package com.jspiders.factorydesignpattern.factorymain;

import java.util.Scanner;

import com.jspiders.factorydesignpattern.menu.Flipcart;
import com.jspiders.factorydesignpattern.menu.JEans;
import com.jspiders.factorydesignpattern.menu.Jackets;
import com.jspiders.factorydesignpattern.menu.Shirts;
import com.jspiders.factorydesignpattern.menu.Shoes;
import com.jspiders.factorydesignpattern.menu.Watch;

public class FlipcartApp {

	private static Flipcart flipcart;
	private static boolean loop = true;

	public static void main(String[] args) {

		while (loop) {
			 
			FlipcartOrder();
			flipcart.purchaseItem();

		}

	}

	private static Flipcart FlipcartOrder() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("\n \n \n Please place Your order");
		
		System.out.println("1.Jackets" + " \n 2.Jeans " + "\n 3.Shirts" + "\n 4.Shoes" + "\n 5.Watch "+"6.exit");
		int choise = scanner.nextInt();
		
		switch (choise) {
		case 1:
			flipcart = new Jackets();
			break;
		case 2:
			flipcart = new JEans();
			break;
		case 3:
			flipcart = new Shirts();

			break;
		case 4:
			flipcart=new Shoes();
			break;
		case 5:
			flipcart=new Watch();
			break;
		case 6:
			System.out.println("Thank You visit again");
			loop=false;
			break;
			default:
				System.out.println("Invalid choice please try again");
				FlipcartOrder();
				flipcart=null;
			
			return flipcart;
				
		}
		return flipcart;

	}

}
