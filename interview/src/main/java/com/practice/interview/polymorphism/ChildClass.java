package com.practice.interview.polymorphism;

public class ChildClass extends ParentClass {

	// Parent class method declares checked/un-checked exception no need to
	// throws it from overridden method
	@Override
	public void m1() {
		System.out.println("Parent -> m1()");
	}

	// Can't override private method

	// parent method throws Exception but no need for child to throw the
	// exception but visa versa in not true.
	// protected in parent but we can make it public in child
	@Override
	public void m3(int i) {
	}

	// default in parent but we can make it public/protected in child
	@Override
	// protected void m4(int i, int j) throws Exception {
	protected void m4(int i, int j) {
	}

	// Child class declare no exception or should declare same or the child
	// class checked exception
	@Override
	public void m5() {

	}

	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		childClass.m1();
	}

}
