package com.practice.interview.abstractclasses;

public abstract class FirstAbstractClass extends SecondAbstractClass {
	public void m1() {

	}

	public abstract void m2();

	public abstract void concreteMethod();

	// Can't have a method like below
	// Either declare abstract or provide the body
	//
	// public void concreteMethod();

	// Either Remove abstract or method body
	//
	// public abstract abstractConcreteMethod() {
	// }
}
