package com.tushar.multithreading;

public class Namingmethod extends Thread {
	 public void run() {
		 System.out.println("Thread is running");
		 Thread.currentThread().setName("tushar");
		 System.out.println(Thread.currentThread().getName());
		 System.out.println(Thread.currentThread().isDaemon());
	 }
	
	public static void main(String[] args) throws InterruptedException {
		Namingmethod nm = new Namingmethod();
		nm.setDaemon(true);	
		nm.start();
		Thread.currentThread();
		Thread.sleep(10);
		System.out.println(Thread.currentThread().getPriority());
	}
}
