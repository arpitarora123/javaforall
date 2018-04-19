package com.practice.interview.polymorphism;

import java.io.FileNotFoundException;

public class ChildClass extends ParentClass {

	// Parent class method declares checked/un-checked exception no need to
	// throws it from overridden method
	@Override
	public void m1() {
		System.out.println("Child -> m1()");
	}

	// Can't override private method

	// parent method throws Exception but no need for child to throw the
	// exception but visa versa in not true.
	// protected in parent but we can make it public in child
	// overridden method of child class can only throw same or the child-
	// -exception of the parent method
	@Override
	public void m3(int i) throws FileNotFoundException {
	}

	// default in parent but we can make it public/protected in child
	@Override
	// protected void m4(int i, int j) throws Exception {
	protected void m4(int i, int j) {
	}

	// Child class declare no exception or should declare same or the child
	// class of the exception
	@Override
	public void m5() {

	}

	public void m8() {
		System.out.println("m8 -> c");
	}

	@Override
	protected double sum(int a, double b) {
		return 5;
	}

	public static void main(String[] args) throws Exception {
		ChildClass childClass = new ChildClass();
		childClass.m1();
		childClass.m8();

		ParentClass parentChild = new ChildClass();
		parentChild.m1();
		/*
		 * m8() is not defined for parent reference, parent reference can only
		 * access the parent methods and method from child that are common in
		 * both
		 */
		// parentChild.m8();
		parentChild.m6();

		// default variable a is accesseble in the same package
		System.out.println(new ChildClass().a);
	}

}
