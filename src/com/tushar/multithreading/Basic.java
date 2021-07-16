package com.tushar.multithreading;

public class Basic extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Run Thread running");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Basic b = new Basic();
		b.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Threading running");
		}
	}
}
