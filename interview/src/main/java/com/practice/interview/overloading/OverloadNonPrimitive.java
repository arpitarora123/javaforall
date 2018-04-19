package com.practice.interview.overloading;

public class OverloadNonPrimitive {

	public void test(String s) {
		System.out.println("String " + s);
	}

	/* If uncomment this call using null will be a compilation error */
	// public void test(Double d) {
	// System.out.println("Double " + d);
	// }

	public void test(Object obj) {
		System.out.println("Object " + obj);
	}

	public void test(int i) {
		System.out.println("int " + i);
	}

	public static void main(String[] args) {
		OverloadNonPrimitive onp = new OverloadNonPrimitive();

		/* First promotion to Other object */
		onp.test(null);
	}

}
