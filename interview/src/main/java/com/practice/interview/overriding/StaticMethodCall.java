package com.practice.interview.overriding;

public class StaticMethodCall {

	static void show() {
		System.out.println("Please hide, don't show off!");
	}

	public static void main(String[] args) {

		/*
		 * Static method call binding takes place at compile time so below code
		 * will work fine
		 */
		StaticMethodCall smc = null;
		smc.show();
	}
}
