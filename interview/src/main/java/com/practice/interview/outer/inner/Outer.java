package com.practice.interview.outer.inner;

public class Outer {
	
	public Outer() {
		System.out.println("Outer class constructor");
	}
	public class Inner {
		
		public Inner() {
			System.out.println("Inner class constructor");
		}
		
		public void innerMethod() {
			System.out.println("Inner Method");
		}
	}
	
	public void outerMethod() {
		System.out.println("Outer Method");
	}
	
}
