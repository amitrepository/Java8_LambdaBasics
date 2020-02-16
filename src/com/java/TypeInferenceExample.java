package com.java;

public class TypeInferenceExample {

	public static void main(String[] args) {
		
		StringLength lambda=s->s.length();
		System.out.println(lambda.getLength("Amit kumar"));	
		
	}
	
	
	interface StringLength{
		int getLength(String str);
	}

}
