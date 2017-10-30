package com.practice.interview.designpattern;

public class LazySingletonClass {

	private static LazySingletonClass singletonDemo;

	private LazySingletonClass() {

	}

	public static LazySingletonClass getInstance() {
		if (null == singletonDemo) {
			synchronized (LazySingletonClass.class) {
				singletonDemo = new LazySingletonClass();
			}
		}

		return singletonDemo;
	}
}
