package com.jspiders.multithreading.runnableintrrface;

public class Thread2 implements Runnable {

	@Override
	public void run() {
			for(int i=1;i<=5;i++) {
			System.out.println("MyThread 2 is runningn");
			}
	}
}
