package com.practice.interview.polymorphism;

import java.io.IOException;

public class ParentClass {

	public void m1() throws ClassNotFoundException {
		System.out.println("Parent -> m1()");
	}

	private void m2() {

	}

	protected void m3(int i) throws Exception {
		m2();
	}

	void m4(int i, int j) {

	}

	// Checked Exception
	public void m5() throws IOException {

	}
}
