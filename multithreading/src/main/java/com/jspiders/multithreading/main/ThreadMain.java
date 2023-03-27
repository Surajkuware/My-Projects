package com.jspiders.multithreading.main;

import com.jspiders.multithreading.runnableintrrface.Thread2;
import com.jspiders.multithreading.threadclass.Thread1;

public class ThreadMain {
		
	public static void main(String[] args) {
		
		Thread1 thread1=new Thread1();
		
		Thread2 thread2= new Thread2();
		
		Thread thread=new Thread(thread2);
		
		thread1.start();
		thread.start();
		
		
	}
}
