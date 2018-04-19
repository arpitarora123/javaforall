package com.practice.interview.polymorphism;

import java.io.IOException;

public class ParentClass {

	int a = 5;

	public void m1() throws ClassNotFoundException {
		System.out.println("Parent -> m1()");
	}

	public void m2() {
		System.out.println("Parent -> m2()");
	}

	protected void m3(int i) throws Exception {
		m2();
	}

	void m4(int i, int j) {

	}

	// Checked Exception
	public void m5() throws IOException {
		System.out.println("Parent -> m5()");
	}

	// Not overloading this method
	public void m6() throws IOException {
		System.out.println("Parent -> m6()");
	}

	protected double sum(int a, double b) {
		return a + b;
	}
}
