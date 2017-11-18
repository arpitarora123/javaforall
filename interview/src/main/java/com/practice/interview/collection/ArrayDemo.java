package com.practice.interview.collection;

public class ArrayDemo {

	ArrayDemo() {
		// Protected variable can be accessed in the same package in different
		// class or subclass.
		ArrayLengthVsSize alvs = new ArrayLengthVsSize();
		alvs.protectedDemo = 1;

		// default variable can be accessed in the same package;
		alvs.defaultDemo = 2;
	}

	public static void main(String[] args) {

		Object[] object = new Object[3];
		object[0] = "arpit";
		object[1] = 1;
		object[2] = 3.00;

		System.out.println(object[0] + " " + object[1] + " " + object[2]);
		System.out.println(object[0].getClass() + " " + object[1].getClass() + " " + object[2].getClass());
	}

}
