package com.java;

public interface Greeting {
	public void perform();
	default void add() {
		System.out.println("amit");
	}

}
