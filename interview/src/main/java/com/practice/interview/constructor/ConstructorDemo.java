package com.practice.interview.constructor;

public class ConstructorDemo {

	public ConstructorDemo() {
		super();
		// Runtime exception (Stackoverflow error)
		// ConstructorDemo cd = new ConstructorDemo();
		// System.out.println("Chaining of Consctructor");

		// this and cd1 refers to same object
		System.out.println(this);

		// Protected variable can't be accessed out the pkg if not a subclass
		// ArrayLengthVsSize alvs = new ArrayLengthVsSize();
		// alvs.protectedDemo = 1;

		// default variable cannot be accessed outside the package not even in
		// the subclass
		// alvs.defaultDemo = 2;
	}

	public static void main(String[] args) {
		ConstructorDemo cd1 = new ConstructorDemo();
		System.out.println(cd1);
	}
}
