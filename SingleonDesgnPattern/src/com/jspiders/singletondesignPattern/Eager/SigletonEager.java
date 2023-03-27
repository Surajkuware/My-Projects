package com.jspiders.singletondesignPattern.Eager;

public class SigletonEager {

	
		private static SigletonEager eager;
		
		private static int count;
	
	public SigletonEager( ) {
		
		count++;
		System.out.println(count+" Times object creted");
		
	}
	
	public static SigletonEager getObject() {

		if (eager==null) {
			
			eager=new SigletonEager();
			
		}
		
		
		return eager;
		
	}
	
}
