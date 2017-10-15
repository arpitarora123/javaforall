package com.practice.interview.overloading;

public class OverloadNonPrimitive {

	
	public void test(Object obj) {
		System.out.println("Object " + obj);
	}
	
	public void test(String s) {
		System.out.println("String " + s);
	}

}
