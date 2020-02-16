package com.java;
public class Driver {
	public void greet(Greeting greeting){
		greeting.perform();
	}

	public static void main(String[] args) {
				
		Greeting lambda =()->System.out.print("Hello world lambda");
		
		lambda.perform();

	}

}
