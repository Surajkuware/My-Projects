package com.jespiders.adaptordesignpattern.Adaptor;

import com.jespiders.adaptordesignpattern.Entity1.Employees;
import com.jespiders.adaptordesignpattern.Entity2.Performance;

public class Adaptor extends Employees implements Performance {

	private static Adaptor adaptor = new Adaptor();
	private static Adaptor adaptor2 = new Adaptor();

	@Override
	public void EmployeePerformance() {

		adaptor.setName("Suraj");
		adaptor.setCity("Pune");
		adaptor.setEmail("kuwaresuraj2@gmail.com");

		adaptor2.setName("Shraddha");
		adaptor2.setEmail("shra@gmail.com");
		adaptor2.setCity("NAshik");

		System.out.println(adaptor.getName() + " is better Employee Than " + adaptor2.getName());
	}

	public static void main(String[] args) {
		adaptor.EmployeePerformance();
		adaptor2.EmployeePerformance();

	}

}
