package com.practice.interview.designpattern;

public class LazySingletonUsingInnerClass {

	private LazySingletonUsingInnerClass() {

	}

	private static class InnerSingleton {
		public static LazySingletonUsingInnerClass lazySingletonUsingInnerClass = new LazySingletonUsingInnerClass();
	}

	public static LazySingletonUsingInnerClass getInstance() {

		return InnerSingleton.lazySingletonUsingInnerClass;
	}
}
