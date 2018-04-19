package com.practice.interview.overriding;

public class Child extends Parent {

	/* Compilation error: Can not hide the instance method from the parent */
	// static void m1() { }

	@Override
	public void m1() {
		System.out.println("Child -> non static m1()");
	}

	/*
	 * Compilation error: This instance method can't override the static method
	 */
	// public void m2() { }

	static public void m2() {
		System.out.println("Child -> static m2()");
	}

	public static void main(String[] args) {
		Parent p = new Parent();
		// call to non static method
		p.m1();
		// call to static method
		p.m2();

		Child c = new Child();
		// call to non static method
		c.m1();
		// call to static method
		c.m2();

		Parent pc = new Child();
		// call to non static method
		pc.m1();
		// call to static method
		pc.m2();
	}
}
