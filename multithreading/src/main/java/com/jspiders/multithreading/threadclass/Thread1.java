package com.jspiders.multithreading.threadclass;

public class Thread1 extends Thread{
	
	@Override
	public void run() {

		 for(int i=1;i<=5;i++) {
			 
			 System.out.println("Thread 1 is running");
		 }
	
	}
	
	

}
