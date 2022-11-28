package com.jspiders.TwoThreadsAtOneTime;

import com.jspiders.MultiThreading.MyTheadDemo;
import com.jspiders.MyThreadRunnableInterface.MyThread2;

public class MultipleThreads {
			public static void main(String[] args) {
				MyTheadDemo demo=new MyTheadDemo();
				
				MyThread2 myThread2=new MyThread2();
				Thread thread=new Thread(myThread2);
				
				demo.setName("suraj");
				thread.setName("nikhil");
				
				demo.start();
				thread.start();
//				System.out.println(demo.getName());;
//				System.out.println(thread.getName());
			}
}
