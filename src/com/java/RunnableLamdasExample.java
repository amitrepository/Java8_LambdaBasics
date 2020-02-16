package com.java;

public class RunnableLamdasExample {

	public static void main(String[] args) {

		Thread mythread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("This is inside runnable thread");
			}
		});
		mythread.run();

		Thread mylamdaThread = new Thread(() -> System.out.println("This is inside lamda runnable"));
		mylamdaThread.run();
	}

}
