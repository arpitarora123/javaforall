package com.practice.interview.accessspecifier.outsidepkg;

import com.practice.interview.accessspecifier.ParentClass;

public class ChildClass extends ParentClass {

	int a = 20;

	public static void main(String[] args) {

		// Compile time error, protected member is only accessible outside the
		// pkg through inheritance

		// ParentClass pc = new ParentClass();
		// pc.m1();

		ChildClass cc = new ChildClass();
		cc.m1();

	}
}
